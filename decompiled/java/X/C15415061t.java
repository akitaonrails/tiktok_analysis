package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.061t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15415061t implements AnonymousClass0623 {
    public final InterfaceC15414061s LIZ;

    public static Keva LJI() {
        String strLIZIZ = C461720I8s.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("im_ai_bot_");
        sbLIZ.append(strLIZIZ);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C15415061t(InterfaceC15414061s interfaceC15414061s) {
        this.LIZ = interfaceC15414061s;
    }

    public static List LJ(String str) {
        try {
            return (List) C051M.LIZJ(str, new TypeToken<List<? extends IMAIBotInfo>>() { // from class: X.0624
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C062H.LIZ();
            return null;
        }
    }

    public static final Object LJFF(int i) {
        Keva kevaLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bot_info_");
        sbLIZ.append(i);
        String string = kevaLJI.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string != null && string.length() != 0) {
            return LJ(string);
        }
        return null;
    }

    @Override // X.AnonymousClass0623
    public final IMAIBotInfo LIZ(long j) {
        Iterator<String> it2 = LJI().getAllKey().iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                return null;
            }
            String string = LJI().getString(it2.next(), "");
            if (string != null && string.length() != 0) {
                List listLJ = LJ(string);
                if (listLJ == null) {
                    return null;
                }
                Iterator it3 = listLJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((IMAIBotInfo) next).id == j) {
                        obj = next;
                        break;
                    }
                }
                return (IMAIBotInfo) obj;
            }
        }
    }

    @Override // X.AnonymousClass0623
    public final Unit LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bot_info_");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        List<IMAIBotInfo> listLJ = LJ(LJI().getString(strLIZIZ, ""));
        LJI().erase(strLIZIZ);
        InterfaceC15414061s interfaceC15414061s = this.LIZ;
        if (listLJ == null) {
            listLJ = C13BV.INSTANCE;
        }
        interfaceC15414061s.Ap2(listLJ);
        return Unit.LIZ;
    }

    @Override // X.AnonymousClass0623
    public final Unit LIZJ(long j) {
        List listLJ;
        ArrayList arrayList;
        Object objRemove;
        for (String str : LJI().getAllKey()) {
            String string = LJI().getString(str, "");
            if (string != null && string.length() != 0 && (listLJ = LJ(string)) != null) {
                Iterator it2 = listLJ.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((IMAIBotInfo) it2.next()).id == j) {
                        if (i >= 0 && listLJ != null && (objRemove = ListProtector.remove((arrayList = new ArrayList(listLJ)), i)) != null) {
                            LJI().storeString(str, C051M.LJ(arrayList, false));
                            this.LIZ.Ap2(Collections.singletonList(objRemove));
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x014e -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // X.AnonymousClass0623
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo> r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15415061t.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }
}
