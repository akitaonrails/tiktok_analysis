package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.18Lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21270718Lx implements InterfaceC694960RNu {
    public static final C21270718Lx LIZ = new C21270718Lx();

    @Override // X.InterfaceC694960RNu
    public final boolean LIZLLL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_sv_fix_sticker_sometimes_missing", true);
    }

    @Override // X.InterfaceC694960RNu
    public final boolean LIZ(Aweme aweme) {
        String anchorsExtras;
        Type type;
        if (aweme != null && (anchorsExtras = aweme.getAnchorsExtras()) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(AnchorsExtras.class));
                } else {
                    type = new TypeToken<AnchorsExtras>() { // from class: X.18M0
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, anchorsExtras, type);
                if (!(objFromJson instanceof AnchorsExtras)) {
                    objFromJson = null;
                }
                AnchorsExtras anchorsExtras2 = (AnchorsExtras) objFromJson;
                if (anchorsExtras2 != null && anchorsExtras2.getDynamicPhotoModeInfo() != null) {
                    return true;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6 A[PHI: r4
      0x00f6: PHI (r4v2 int) = (r4v1 int), (r4v0 int) binds: [B:53:0x00f1, B:44:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC694960RNu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r23, com.ss.android.ugc.aweme.feed.model.Aweme r24) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21270718Lx.LIZIZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.feed.model.Aweme r18, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct>> r19) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21270718Lx.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21270718Lx.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC694960RNu
    public final void LIZJ(InterfaceC497601wk interfaceC497601wk, Aweme aweme, AwS590S0100000_11 awS590S0100000_11) {
        if (aweme == null) {
            return;
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (aid.length() != 0 && LIZ(aweme)) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C506701yD(aweme, awS590S0100000_11, aid, null), 3);
        }
    }
}
