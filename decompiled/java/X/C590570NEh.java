package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS29S2000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590570NEh {
    public static int LIZJ;
    public static int LIZLLL;
    public static volatile boolean LJ;
    public static boolean LJII;
    public static int LJIIJ;
    public static final C590570NEh LIZ = new C590570NEh();
    public static int LIZIZ = 2;
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final Set<String> LJI = new LinkedHashSet();
    public static int LJIIIIZZ = C0NEW.ORIGIN.getValue();
    public static String LJIIIZ = "";

    public final synchronized void LIZIZ(String str) {
        String strLIZIZ;
        if (str != null) {
            if (str.length() != 0) {
                if (LJIIIIZZ == C0NEW.DB.getValue()) {
                    C590420NDs.LIZ.getClass();
                    String strLJFF = C590420NDs.LJFF();
                    if (TextUtils.isEmpty(strLJFF)) {
                        strLIZIZ = str;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLJFF);
                        sbLIZ.append(',');
                        sbLIZ.append(str);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C590420NDs.LJI().storeString("incomplete_video_group_db", strLIZIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateIncompleteVideoGroup add=");
                sbLIZ2.append(str);
                sbLIZ2.append(", result=");
                C590420NDs.LIZ.getClass();
                sbLIZ2.append(C590420NDs.LJFF());
                sbLIZ2.append(", version=");
                sbLIZ2.append(LJIIIIZZ);
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final synchronized void LIZJ(Aweme aweme) {
        if (!((Boolean) C279780Axs.LIZ.getValue()).booleanValue()) {
            IFeedCacheLoaderService iFeedCacheLoaderService = (IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class);
            C01GW c01gw = C591010NFz.LJIIJ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                if (iFeedCacheLoaderService.LJIILIIL() < ((Number) c01gw.getValue()).intValue()) {
                    iFeedCacheLoaderService.LJIIJ(Collections.singletonList(aweme));
                }
            } else {
                aweme.setRequestId(LJIIIZ);
                iFeedCacheLoaderService.LJIIJ(Collections.singletonList(aweme));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:112|(2:205|113)|(4:220|114|(3:227|116|231)(10:226|(1:228)(1:230)|145|215|146|(2:201|148)|149|150|82|(2:84|85))|229)|118|(6:120|(2:122|(2:124|(1:126)(1:127))(0))|218|128|210|129)(1:134)|203|135|(3:137|(1:139)|140)(1:150)|82|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x038e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ec A[Catch: Exception -> 0x0417, TryCatch #4 {Exception -> 0x0417, blocks: (B:186:0x03e9, B:187:0x03ec, B:189:0x03f1, B:191:0x0402, B:193:0x040d, B:196:0x0413), top: B:209:0x03e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f1 A[Catch: Exception -> 0x0417, TryCatch #4 {Exception -> 0x0417, blocks: (B:186:0x03e9, B:187:0x03ec, B:189:0x03f1, B:191:0x0402, B:193:0x040d, B:196:0x0413), top: B:209:0x03e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0382 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r20, X.C0NEF r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590570NEh.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0NEF):boolean");
    }

    public final synchronized void LIZLLL(Aweme aweme, boolean z) {
        Set<String> set = LJFF;
        if (set.contains(aweme.getAid())) {
            if (z) {
                C593360NPa.LIZIZ(new AwS553S0100000_9(aweme, 1826));
            }
            return;
        }
        set.add(aweme.getAid());
        if (aweme.getAuthor() != null && aweme.getMusic() != null) {
            UrlModel avatarThumb = aweme.getAuthor().getAvatarThumb();
            UrlModel coverThumb = aweme.getMusic().getCoverThumb();
            if (avatarThumb != null && coverThumb != null) {
                C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb)).LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0NEi
                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                    }
                });
                C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(coverThumb)).LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0NEj
                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                    }
                });
            }
        }
        boolean z2 = true;
        int i = LIZJ + 1;
        LIZJ = i;
        if (i != LIZLLL) {
            z2 = false;
        }
        ((IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class)).LJ(aweme, LJIIIZ, z2);
        C593360NPa.LIZIZ(new AwS127S0110000_9(aweme, z, 20));
    }

    public final synchronized void LJ(String str, String str2) {
        if (str != null) {
            if (str.length() != 0 && str2 != null && str2.length() != 0) {
                Set<String> set = LJI;
                if (set.contains(str)) {
                    return;
                }
                set.add(str);
                C593360NPa.LIZIZ(new AwS29S2000000_9(str, str2, 0));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(':');
                sbLIZ.append(str2);
                sbLIZ.append(".mdl");
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
