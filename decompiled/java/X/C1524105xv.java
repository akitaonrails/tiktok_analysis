package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.analytics.IMInboxAvatarAnalytics$onLoadResultInner$1", f = "DMAvatarAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1524105xv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524105xv(String str, String str2, InterfaceC1493105sv interfaceC1493105sv, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C1524105xv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = interfaceC1493105sv;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1524105xv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zContains;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C1C7U.LIZ("IMInboxAvatarAnalytics@afd.onLoadResultInner$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('_');
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashSet<String> hashSet = C1524205xw.LIZIZ;
        synchronized (hashSet) {
            try {
                zContains = hashSet.contains(strLIZIZ);
                if (!zContains) {
                    hashSet.add(strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC1493105sv interfaceC1493105sv = this.LLILLL;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, this.LLILLJJLI);
        pairArr[1] = new Pair("res_source", String.valueOf(this.LLILZ));
        if (this.LLILZIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_group", str);
        if (this.LLILZLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("success", str2);
        if (this.LLIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("is_same_user", str3);
        if (zContains) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_first_time", str4);
        if (this.LLILZLL && !this.LLIZLLLIL) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str5 = "1";
        }
        pairArr[6] = new Pair("is_default", str5);
        interfaceC1493105sv.sendEvent("im_avatar_load_result", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxAvatarAnalytics@afd.onLoadResultInner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
