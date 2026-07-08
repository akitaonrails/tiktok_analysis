package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Zcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903780Zcu implements IIMSendMsgUxAnalytics {
    public final InterfaceC1493105sv LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function0<Integer> LIZLLL;
    public final Function0<Double> LJ;
    public final Function0<Long> LJFF;
    public final ConcurrentHashMap<String, C903830Zcz> LJI;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LIZLLL() {
        this.LJI.clear();
    }

    public C903780Zcu(int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(364);
        AFwS201S0000000_14 aFwS201S0000000_142 = AFwS201S0000000_14.get$arr$(365);
        AFwS201S0000000_14 aFwS201S0000000_143 = AFwS201S0000000_14.get$arr$(366);
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(396);
        this.LIZ = interfaceC1493505szLIZIZ;
        this.LIZIZ = c054gLIZ;
        this.LIZJ = aFwS201S0000000_14;
        this.LIZLLL = aFwS201S0000000_142;
        this.LJ = aFwS201S0000000_143;
        this.LJFF = aFwS195S0000000_9;
        this.LJI = new ConcurrentHashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final Map<String, String> LIZ(Map<String, String> map) {
        if (this.LJI.size() > 50) {
            this.LJI.clear();
        }
        String string = UUID.randomUUID().toString();
        this.LJI.put(string, new C903830Zcz(string, this.LJFF.invoke().longValue(), 0, "", 0L, EnumC903810Zcx.DISPLAY));
        map.put("send_msg_et_id", string);
        return map;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LIZIZ(long j) {
        ConcurrentHashMap<String, C903830Zcz> concurrentHashMap = this.LJI;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, C903830Zcz>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(C903830Zcz.LIZ(it2.next().getValue()));
        }
        this.LJI.clear();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C23250099c.LIZLLL(this.LIZIZ, null, null, new C903790Zcv((C903830Zcz) it3.next(), EnumC903800Zcw.USER_EXIT, j, this, null), 3);
        }
    }

    public final C903830Zcz LJI(Map<String, String> map) {
        String str = map.get("send_msg_et_id");
        if (str != null && str.length() != 0) {
            return this.LJI.get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LJFF(long j, Map map) {
        C903830Zcz c903830ZczLJI = LJI(map);
        if (c903830ZczLJI == null) {
            return;
        }
        c903830ZczLJI.LJ = j;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LIZJ(long j, int i, Map map) {
        boolean zContains;
        EnumC903800Zcw enumC903800Zcw;
        C903830Zcz c903830ZczLJI = LJI(map);
        if (c903830ZczLJI == null) {
            return;
        }
        int i2 = C903820Zcy.LIZ[c903830ZczLJI.LJFF.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                zContains = C13LQ.LJLIIL(new Integer[]{2, 3}).contains(Integer.valueOf(i));
            } else {
                throw new C1954807lC();
            }
        } else {
            zContains = C13LQ.LJLIIL(new Integer[]{1, 0, 3}).contains(Integer.valueOf(i));
        }
        if (!zContains) {
            return;
        }
        EnumC903810Zcx enumC903810Zcx = c903830ZczLJI.LJFF;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC903800Zcw = EnumC903800Zcw.UNEXPECTED;
                } else {
                    enumC903800Zcw = EnumC903800Zcw.FAILED;
                }
            } else {
                enumC903800Zcw = EnumC903800Zcw.SUCCESS;
            }
        } else if (enumC903810Zcx == EnumC903810Zcx.DISPLAY) {
            enumC903800Zcw = EnumC903800Zcw.SUCCESS;
        } else {
            enumC903800Zcw = EnumC903800Zcw.UNEXPECTED;
        }
        C903830Zcz c903830ZczLIZ = C903830Zcz.LIZ(c903830ZczLJI);
        EnumC903810Zcx enumC903810Zcx2 = c903830ZczLJI.LJFF;
        if (enumC903810Zcx2 == EnumC903810Zcx.DISPLAY) {
            c903830ZczLJI.LJFF = EnumC903810Zcx.SENT;
            if (enumC903800Zcw != EnumC903800Zcw.SUCCESS) {
                this.LJI.remove(c903830ZczLJI.LIZ);
            }
        } else if (enumC903810Zcx2 == EnumC903810Zcx.SENT) {
            this.LJI.remove(c903830ZczLJI.LIZ);
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C903790Zcv(c903830ZczLIZ, enumC903800Zcw, j, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics
    public final void LJ(int i, String str, Map map) {
        C903830Zcz c903830ZczLJI = LJI(map);
        if (c903830ZczLJI == null) {
            return;
        }
        c903830ZczLJI.LIZJ = i;
        c903830ZczLJI.LIZLLL = str;
    }
}
