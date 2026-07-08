package X;

import android.graphics.Bitmap;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.socialavatar.network.LegacySocialAvatarCreationApi;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HMP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMP {
    public static int LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;
    public static final C439230HKf LJFF;
    public static final C0HMP LIZ = new C0HMP();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(637));

    static {
        LIZLLL = "";
        C0HMU c0hmu = new C0HMU();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        C0HMW.LIZ.getClass();
        C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0HMX.LIZIZ);
        c1499850p8JCreateBuilder.LIZ(((IAbilityService) c0hmu.LIZ.getValue()).effectService().getEpRequestInterceptor());
        LJFF = new C439230HKf((LegacySocialAvatarCreationApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(LegacySocialAvatarCreationApi.class));
        LIZJ = LIZJ().getBoolean("key_aimoji_album_guide_panel", LIZJ().getBoolean(LJ("key_aimoji_album_guide_panel"), false));
        LIZJ().storeBoolean(LJ("key_aimoji_album_guide_panel"), LIZJ);
        LIZLLL = LIZJ().getString(LJ("key_aimoji_task_id"), "");
        LIZJ().storeString(LJ("key_aimoji_task_id"), LIZLLL);
    }

    public static C0HHS LIZ() {
        C0HHS c0hhs;
        C0HHB c0hhb = C0HHB.LIZ;
        C0HFK c0hfk = C0HFK.SOCIAL_AVATAR;
        synchronized (c0hhb) {
            c0hhs = C0HHB.LIZIZ.get(c0hfk);
        }
        return c0hhs;
    }

    public static Keva LIZJ() {
        return (Keva) LJ.getValue();
    }

    public static void LIZIZ(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        LIZJ().storeBytes(LJ("key_aimoji_image"), byteArrayOutputStream.toByteArray());
    }

    public static String LJ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0HMQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.socialavatar.network.socialavatar.SocialAvatarXAuthConfig> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0HMS
            if (r0 == 0) goto L20
            r4 = r6
            X.0HMS r4 = (X.C0HMS) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L5e
        L20:
            X.0HMS r4 = new X.0HMS
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = X.C297690Blf.LIZ()     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L4c
            X.0o1f r0 = lth.o.LJIIZILJ     // Catch: java.lang.Exception -> L70
            boolean r0 = r0.isLogin()     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L4c
            X.0HLY r2 = new X.0HLY     // Catch: java.lang.Exception -> L70
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L70
            java.lang.String r0 = "Not Login"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L70
            r2.<init>(r1)     // Catch: java.lang.Exception -> L70
            throw r2     // Catch: java.lang.Exception -> L70
        L4c:
            X.0HMQ r0 = new X.0HMQ     // Catch: java.lang.Exception -> L70
            r0.<init>()     // Catch: java.lang.Exception -> L70
            com.ss.android.ugc.aweme.socialavatar.network.socialavatar.SocialAvatarImageXApi r0 = r0.LIZ()     // Catch: java.lang.Exception -> L70
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L70
            java.lang.Object r3 = r0.getImageXAuthKey(r4)     // Catch: java.lang.Exception -> L70
            if (r3 != r2) goto L61
            return r2
        L5e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L70
        L61:
            com.ss.android.ugc.aweme.socialavatar.network.socialavatar.AuthKeyResponse r3 = (com.ss.android.ugc.aweme.socialavatar.network.socialavatar.AuthKeyResponse) r3     // Catch: java.lang.Exception -> L70
            com.ss.android.ugc.aweme.socialavatar.network.socialavatar.SocialAvatarXAuthConfig r0 = r3.socialAvatarXAuthConfig     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L68
            return r0
        L68:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L70
            java.lang.String r0 = "Social Avatar X Auth Config is null"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L70
            throw r1     // Catch: java.lang.Exception -> L70
        L70:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getImageXAuthKey SocialAvatar onFailure: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L85
            java.lang.String r0 = ""
        L85:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0HLY r0 = new X.0HLY
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HMP.LIZLLL(X.05Vn):java.lang.Object");
    }
}
