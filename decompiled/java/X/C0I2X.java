package X;

import androidx.emoji2.text.e;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0I2X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2X {
    public static final C0I2X LIZ = new C0I2X();
    public static final Keva LIZIZ = Keva.getRepo("comment_personalized_emoji");
    public static final Gson LIZJ = C7740030o.LIZ().getGson();
    public static String LIZLLL;
    public static final String[] LJ;
    public static final C01GW LJFF;
    public static C08I7<String, Long> LJI;
    public static final C08I7<String, List<CommentPersonalizedEmoji>> LJII;
    public static final C08I7<String, List<CommentPersonalizedEmoji>> LJIIIIZZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("used_emojis_");
        sbLIZ.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        LJ = new String[]{"😁", "🥰", "😂", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎"};
        LJFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(626));
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0I2Y
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    C0I2X.LJI = null;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("used_emojis_");
                    C0I2X.LIZ.getClass();
                    sbLIZ2.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
                    C0I2X.LIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        });
        LJII = new C08I7<>(1);
        LJIIIIZZ = new C08I7<>(1);
    }

    public static List LIZIZ() {
        String[] strArr = LJ;
        ArrayList arrayList = new ArrayList(C1697810uHb.LJIIJJI(Arrays.copyOf(strArr, strArr.length)));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!e.LJ()) {
                LIZ.getClass();
                List list = (List) LJFF.getValue();
                if (list == null || !list.contains(obj)) {
                }
            }
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new CommentPersonalizedEmoji((String) it2.next(), 0, "", "comment_icon"));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDefaultEmojis ");
        sbLIZ.append(arrayList3);
        C2188811AlT.LIZIZ(sbLIZ);
        return arrayList3;
    }

    public static C08I7 LJ() {
        if (LJI == null) {
            LJI = new C08I7<>(16);
            try {
                for (C459980I2a c459980I2a : (List) LIZJ.LJIIIIZZ(LIZIZ.getString(LIZLLL, null), new TypeToken<List<? extends C459980I2a>>() { // from class: X.0I2Z
                }.getType())) {
                    C08I7<String, Long> c08i7 = LJI;
                    if (c08i7 != null) {
                        c459980I2a.getClass();
                        c08i7.LIZLLL(null, 0L);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LJI;
    }

    public static void LIZ(String str) {
        C08I7 c08i7LJ = LJ();
        if (c08i7LJ != null) {
            c08i7LJ.LIZLLL(str, Long.valueOf(System.currentTimeMillis() + 2592000000L));
        }
    }

    public static List LIZJ(Aweme aweme) {
        ArrayList arrayList = new ArrayList(LIZLLL(aweme));
        LIZ.getClass();
        arrayList.addAll(LIZIZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFullEmojiList ");
        sbLIZ.append(arrayList);
        C2188811AlT.LIZIZ(sbLIZ);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((CommentPersonalizedEmoji) obj).emoji)) {
                arrayList2.add(obj);
            }
        }
        List listLLIIII = C13LP.LLIIII(arrayList2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getDistinctFullEmojiList ");
        sbLIZ2.append(listLLIIII);
        C2188811AlT.LIZIZ(sbLIZ2);
        return listLLIIII;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ca  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I2X.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.List");
    }
}
