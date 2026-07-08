package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388480mEg implements InterfaceC1354700lMC {
    @Override // X.InterfaceC1354700lMC
    public final String LIZ(String str, String str2) {
        String strLIZJ = C08HM.LIZJ(str);
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AI_CHAT, String.valueOf(C461720I8s.LIZJ()), true).getPath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(str2);
        return new C0VSJ(path, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
    }

    @Override // X.InterfaceC1354700lMC
    public final Bitmap LIZIZ(Context context, Bitmap bitmap) {
        C2476109n5.LIZ.getClass();
        return C2476109n5.LIZ(context, bitmap);
    }

    @Override // X.InterfaceC1354700lMC
    public final void LJ(Context context, Uri uri) throws Throwable {
        if (uri != null) {
            C2476109n5.LIZ.getClass();
            String strLIZIZ = C2476109n5.LIZIZ(context, uri);
            if (strLIZIZ != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15472063y(strLIZIZ, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1354700lMC
    public final Object LIZJ(UrlModel urlModel, String str, InterfaceC1364105Vn<? super C07YI> interfaceC1364105Vn) {
        String str2 = (String) C13LP.LJJJLL(urlModel.getUrlList());
        if (str2 == null) {
            return new C07YI(2, "", 0L, 12);
        }
        return LIZLLL(new C558560LvS(str2, str, urlModel.getWidth(), urlModel.getHeight()), "ai_photo_comment_download_cover", interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1354700lMC
    public final Object LIZLLL(final C558560LvS c558560LvS, final String str, InterfaceC1364105Vn<? super C07YI> interfaceC1364105Vn) {
        int i;
        Pair pair;
        final int i2;
        Executor executorLIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C0VSJ c0vsj = new C0VSJ(c558560LvS.LIZIZ);
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            Boolean.valueOf(parentFile.mkdirs());
        }
        int i3 = c558560LvS.LIZJ;
        int i4 = c558560LvS.LIZLLL;
        int i5 = C342380DbY.LIZ().uploadPhotoMaxEdge;
        if (i3 <= i5 && i4 <= i5) {
            pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            float f = i3 / i4;
            if (f > 1.0f) {
                i = (int) (i5 / f);
            } else {
                i = i5;
                i5 = (int) (i5 * f);
            }
            pair = new Pair(Integer.valueOf(i5), Integer.valueOf(i));
        }
        if (C1325420kay.LIZIZ(c558560LvS.LIZ)) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c558560LvS.LIZ);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        c1331670kl3LJIIIZ.LJIIIIZZ = iIntValue;
        c1331670kl3LJIIIZ.LJIIIZ = iIntValue2;
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        AbstractC2252651DEx abstractC2252651DEx = (AbstractC2252651DEx) c23260099m.getContext().get(AbstractC2252651DEx.Key);
        if (abstractC2252651DEx != null) {
            executorLIZ = C2182901Abw.LIZ(abstractC2252651DEx);
        } else {
            executorLIZ = null;
        }
        c1331670kl3LJIIIZ.LJJIIJZLJL = executorLIZ;
        c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0mEf
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f2) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                C201955140j.LIZIZ(C1357140lQ8.LIZIZ.LIZ, "AIPhotoCommentHelper -> canceled");
                C1388480mEg c1388480mEg = this.LL;
                long j = jCurrentTimeMillis;
                String str2 = str;
                int i6 = i2;
                c1388480mEg.getClass();
                C1388480mEg.LJFF(i6, str2, null, 1002, j, false);
                InterfaceC1364105Vn<C07YI> interfaceC1364105Vn2 = c23260099m;
                C07YI c07yi = new C07YI(i2, "", System.currentTimeMillis() - jCurrentTimeMillis, "cancel");
                C189200o6.m2constructorimpl(c07yi);
                interfaceC1364105Vn2.resumeWith(c07yi);
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) throws Throwable {
                if (bitmap == null) {
                    C201955140j.LIZIZ(C1357140lQ8.LIZIZ.LIZ, "AIPhotoCommentHelper -> bitmap is null");
                    C1388480mEg c1388480mEg = this.LL;
                    long j = jCurrentTimeMillis;
                    String str2 = str;
                    int i6 = i2;
                    c1388480mEg.getClass();
                    C1388480mEg.LJFF(i6, str2, null, LSPassThroughRecordSizeConfig.DEFAULT, j, false);
                    InterfaceC1364105Vn<C07YI> interfaceC1364105Vn2 = c23260099m;
                    C07YI c07yi = new C07YI(i2, "", System.currentTimeMillis() - jCurrentTimeMillis, 8);
                    C189200o6.m2constructorimpl(c07yi);
                    interfaceC1364105Vn2.resumeWith(c07yi);
                    return;
                }
                try {
                    C0VSV c0vsv = new C0VSV(c0vsj);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                        c0vsv.flush();
                        C2107108Nh.LIZ(c0vsv, null);
                        bitmap.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                        C1388480mEg c1388480mEg2 = this.LL;
                        long j2 = jCurrentTimeMillis;
                        String str3 = str;
                        int i7 = i2;
                        c1388480mEg2.getClass();
                        C1388480mEg.LJFF(i7, str3, null, -1, j2, true);
                        InterfaceC1364105Vn<C07YI> interfaceC1364105Vn3 = c23260099m;
                        C07YI c07yi2 = new C07YI(i2, c558560LvS.LIZIZ, System.currentTimeMillis() - jCurrentTimeMillis, 8);
                        C189200o6.m2constructorimpl(c07yi2);
                        interfaceC1364105Vn3.resumeWith(c07yi2);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            C2107108Nh.LIZ(c0vsv, th);
                                            throw th;
                                        } catch (Exception e) {
                                            e = e;
                                            TryCatchGuardChecker.doCheck(e);
                                            bitmap.recycle();
                                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("failed to write bitmap, msg: ");
                                            sbLIZ.append(e.getMessage());
                                            C21290818Tq.LIZIZ("AiChatFileExternal", C2188811AlT.LIZIZ(sbLIZ), null);
                                            C1388480mEg c1388480mEg3 = this.LL;
                                            long j3 = jCurrentTimeMillis;
                                            String str4 = str;
                                            int i8 = i2;
                                            String message = e.getMessage();
                                            c1388480mEg3.getClass();
                                            C1388480mEg.LJFF(i8, str4, message, 1001, j3, false);
                                            InterfaceC1364105Vn<C07YI> interfaceC1364105Vn4 = c23260099m;
                                            int i9 = i2;
                                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                            String message2 = e.getMessage();
                                            if (message2 == null) {
                                                message2 = "";
                                            }
                                            C07YI c07yi3 = new C07YI(i9, "", jCurrentTimeMillis2, message2);
                                            C189200o6.m2constructorimpl(c07yi3);
                                            interfaceC1364105Vn4.resumeWith(c07yi3);
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th = null;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                String message2;
                String str2 = C1357140lQ8.LIZIZ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIPhotoCommentHelper -> failed, msg: ");
                String message3 = null;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                C1388480mEg c1388480mEg = this.LL;
                long j = jCurrentTimeMillis;
                String str3 = str;
                int i6 = i2;
                if (th != null) {
                    message3 = th.getMessage();
                }
                c1388480mEg.getClass();
                C1388480mEg.LJFF(i6, str3, message3, 1001, j, false);
                InterfaceC1364105Vn<C07YI> interfaceC1364105Vn2 = c23260099m;
                int i7 = i2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (th == null || (message2 = th.getMessage()) == null) {
                    message2 = "";
                }
                C07YI c07yi = new C07YI(i7, "", jCurrentTimeMillis2, message2);
                C189200o6.m2constructorimpl(c07yi);
                interfaceC1364105Vn2.resumeWith(c07yi);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static void LJFF(int i, String str, String str2, int i2, long j, boolean z) {
        int i3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        boolean z2 = false;
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        if (i == 1) {
            z2 = true;
        }
        c2344009Gk.LJ(Boolean.valueOf(z2), "use_cache");
        if (!z) {
            c2344009Gk.LIZJ(i2, "error_code");
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJFF("error_message", str2);
        }
        C20684815ws.LJIILLIIL("ai_chat_download_photo_performance_monitor", c2344009Gk.LIZ);
    }
}
