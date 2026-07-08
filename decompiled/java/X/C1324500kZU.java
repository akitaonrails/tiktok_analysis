package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.ScreenShotData;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.page.main.functions.share.MinisShareToStoryAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324500kZU extends C09AY implements Function1<Function1<? super C1392140mKa, ? extends Unit>, Unit> {
    public final /* synthetic */ MinisShareToStoryAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324500kZU(MinisShareToStoryAssem minisShareToStoryAssem) {
        super(1);
        this.LL = minisShareToStoryAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super C1392140mKa, ? extends Unit> function1) {
        ScreenShotData screenShotDataScreenshot;
        Object kitView;
        View view;
        final C19EG c19egLIZ;
        final Function1<? super C1392140mKa, ? extends Unit> function12 = function1;
        if (this.LL.m267do().GE()) {
            try {
                IMiniGameRuntimeAPI iMiniGameRuntimeAPIGb = this.LL.m267do().gb();
                if (iMiniGameRuntimeAPIGb != null && (screenShotDataScreenshot = iMiniGameRuntimeAPIGb.screenshot()) != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(screenShotDataScreenshot.width, screenShotDataScreenshot.height, Bitmap.Config.ARGB_8888);
                    screenShotDataScreenshot.pixels.rewind();
                    bitmapCreateBitmap.copyPixelsFromBuffer(screenShotDataScreenshot.pixels);
                    MinisShareToStoryAssem minisShareToStoryAssem = this.LL;
                    minisShareToStoryAssem.LLILLJJLI = function12;
                    minisShareToStoryAssem.ho(bitmapCreateBitmap);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                MinisShareToStoryAssem minisShareToStoryAssem2 = this.LL;
                minisShareToStoryAssem2.LLILLJJLI = null;
                minisShareToStoryAssem2.fo(function12, new C1392140mKa(2, "native - take screen shot failed", 4));
            }
        } else {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVb = this.LL.m267do().Vb();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVb != null) {
                kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVb.getKitView();
            } else {
                kitView = null;
            }
            if ((kitView instanceof WebKitView) && (view = (View) kitView) != null && (c19egLIZ = C724240Sb0.LIZ(this.LL)) != null) {
                final Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i = iArr[0];
                final Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.LL.m267do().CK(true);
                        final MinisShareToStoryAssem minisShareToStoryAssem3 = this.LL;
                        HandlerHook.viewPost(view, new Runnable() { // from class: X.0kZS
                            public final void LIZ() {
                                Window window = c19egLIZ.getWindow();
                                Rect rect2 = rect;
                                final Bitmap bitmap = bitmapCreateBitmap2;
                                final MinisShareToStoryAssem minisShareToStoryAssem4 = minisShareToStoryAssem3;
                                final Function1<C1392140mKa, Unit> function13 = function12;
                                C1322890kWt.LJ(window, rect2, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0kZT
                                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                    public final void onPixelCopyFinished(int i2) {
                                        minisShareToStoryAssem4.m267do().CK(false);
                                        if (i2 == 0) {
                                            MinisShareToStoryAssem minisShareToStoryAssem5 = minisShareToStoryAssem4;
                                            minisShareToStoryAssem5.LLILLJJLI = function13;
                                            minisShareToStoryAssem5.ho(bitmap);
                                            return;
                                        }
                                        minisShareToStoryAssem4.fo(function13, new C1392140mKa(1, "h5 - copy frame failed", 4));
                                    }
                                }, new BPEAHandler(Looper.getMainLooper()), CertProviderManagerKt.findCert("bpea-minis_game_screenshot", 1476435991));
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("MinisShareToStoryAssem@b0bd.onPageShow$1$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("MinisShareToStoryAssem@b0bd.onPageShow$1$1");
                            }
                        });
                    } else {
                        MinisShareToStoryAssem minisShareToStoryAssem4 = this.LL;
                        minisShareToStoryAssem4.LLILLJJLI = null;
                        minisShareToStoryAssem4.fo(function12, new C1392140mKa(2, "h5 - System version is too low", 4));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    MinisShareToStoryAssem minisShareToStoryAssem5 = this.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("h5 - ");
                    sbLIZ.append(e2.getMessage());
                    minisShareToStoryAssem5.fo(function12, new C1392140mKa(3, C2188811AlT.LIZIZ(sbLIZ), 4));
                }
            }
        }
        return Unit.LIZ;
    }
}
