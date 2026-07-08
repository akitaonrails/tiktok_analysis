package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.061m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15408061m implements InterfaceC1491705sh {
    public static final C15408061m LIZ = new C15408061m();
    public static final C15407061l LIZIZ = new C15407061l();

    @Override // X.InterfaceC1491705sh
    public final IMAIBotInfo LIZ(long j) {
        return LIZIZ.LIZJ(j, EnumC1510605vk.LOCAL);
    }

    @Override // X.InterfaceC1491705sh
    public final boolean LIZIZ(String str) {
        IMAIBotInfo iMAIBotInfoLIZJ = LIZIZ.LIZJ(C0YNP.LJII(str), EnumC1510605vk.LOCAL);
        if (iMAIBotInfoLIZJ != null && iMAIBotInfoLIZJ.status == C062E.BOT_STATUS_CREATING.getValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1491705sh
    public final String LIZJ(String str) {
        String str2;
        IMAIBotInfo iMAIBotInfoLIZJ = LIZIZ.LIZJ(C0YNP.LJII(str), EnumC1510605vk.LOCAL);
        if (iMAIBotInfoLIZJ != null && (str2 = iMAIBotInfoLIZJ.progressText) != null) {
            return str2;
        }
        return "";
    }

    @Override // X.InterfaceC1491705sh
    public final void LIZLLL(InterfaceC15414061s interfaceC15414061s) {
        C15407061l c15407061l = LIZIZ;
        synchronized (c15407061l.LLILZIL) {
            try {
                ((ArrayList) c15407061l.LLILZIL).remove(interfaceC15414061s);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1491705sh
    public final List<IMAIBotInfo> LJ(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            IMAIBotInfo iMAIBotInfoLIZJ = LIZIZ.LIZJ(((Number) it2.next()).longValue(), EnumC1510605vk.LOCAL);
            if (iMAIBotInfoLIZJ != null) {
                arrayList.add(iMAIBotInfoLIZJ);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1491705sh
    public final void LJFF(InterfaceC15414061s interfaceC15414061s) {
        LIZIZ.LJ(interfaceC15414061s);
    }

    @Override // X.InterfaceC1491705sh
    public final IMUser LJI(IMAIBotInfo iMAIBotInfo) {
        String string;
        String str;
        String str2;
        IMUser iMUser = new IMUser();
        if (iMAIBotInfo == null || (string = Long.valueOf(iMAIBotInfo.id).toString()) == null) {
            string = "";
        }
        iMUser.setUid(string);
        String str3 = null;
        if (iMAIBotInfo != null) {
            str = iMAIBotInfo.nickname;
        } else {
            str = null;
        }
        iMUser.setNickName(str);
        if (iMAIBotInfo != null) {
            str2 = iMAIBotInfo.avatarUrl;
        } else {
            str2 = null;
        }
        iMUser.setAvatarStr(str2);
        if (iMAIBotInfo != null) {
            str3 = iMAIBotInfo.avatarUrl;
        }
        iMUser.setAvatarThumb(C626590Oht.LIZ(0, 0, str3));
        return iMUser;
    }

    @Override // X.InterfaceC1491705sh
    public final void d(BusinessCommandMessage businessCommandMessage) {
        C062B c062b = LIZIZ.LLILLL;
        c062b.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C062D(c062b, businessCommandMessage, null), 3);
    }

    public static List LJII(int i, EnumC1510605vk enumC1510605vk) {
        return LIZIZ.LIZLLL(i, enumC1510605vk);
    }
}
