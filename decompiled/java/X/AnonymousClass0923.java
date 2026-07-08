package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0923, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineEffectHandler$extractFirstFrame$2", f = "AIGCOfflineEffectHandler.kt", l = {1109}, m = "invokeSuspend")
public final class AnonymousClass0923 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C578910MnB LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0923(String str, C578910MnB c578910MnB, InterfaceC1364105Vn<? super AnonymousClass0923> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c578910MnB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0923 anonymousClass0923 = new AnonymousClass0923(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        anonymousClass0923.LLILLJJLI = obj;
        return anonymousClass0923;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLIZ = obj;
        C1C7U.LIZ("AIGCOfflineEffectHandler@7df1.extractFirstFrame$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                String str = this.LLILLL;
                final C578910MnB c578910MnB = this.LLILZ;
                this.LLILLJJLI = str;
                this.LL = 1;
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                final C013C c013c = new C013C();
                int videoThumb = VEUtils.getVideoThumb(str, 0, new InterfaceC1286300jZs() { // from class: X.0924
                    @Override // X.InterfaceC1286300jZs
                    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                        CreativeInfo creativeInfo;
                        if (byteBuffer == null) {
                            AnonymousClass0923.LIZ(null, c23260099m, c013c);
                            return true;
                        }
                        try {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
                            ShortVideoContext shortVideoContext = c578910MnB.LLILLJJLI;
                            if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
                                creativeInfo = new CreativeInfo(null, 0, null, 7, null);
                            }
                            String strLJJJJLL = pathAdapter.LJJJJLL(creativeInfo);
                            try {
                                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                boolean zLJFF = C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, new C0VSJ(strLJJJJLL));
                                C013C c013c2 = c013c;
                                InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                                if (!zLJFF) {
                                    strLJJJJLL = null;
                                }
                                AnonymousClass0923.LIZ(strLJJJJLL, interfaceC1364105Vn, c013c2);
                                bitmapCreateBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                return true;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C786410Ut5.LJJJJ(bitmapCreateBitmap);
                                throw th;
                            }
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("failed extractFirstFrame frame copy: ");
                            sbLIZ.append(e);
                            AnonymousClass0925.LIZIZ("aigc_offline_effect_handler", C2188811AlT.LIZIZ(sbLIZ));
                            AnonymousClass0923.LIZ(null, c23260099m, c013c);
                            return true;
                        }
                    }
                }, true, 80, 40, 0L, 0);
                if (videoThumb != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed extractFirstFrame getVideoThumb: ");
                    sbLIZ.append(videoThumb);
                    AnonymousClass0925.LIZIZ("aigc_offline_effect_handler", C2188811AlT.LIZIZ(sbLIZ));
                    LIZ(null, c23260099m, c013c);
                }
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.extractFirstFrame$2");
                    return objLJFF;
                }
            }
            c098200Yq = (String) objLIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            AnonymousClass0925.LIZIZ("aigc_offline_effect_handler", "failed extractFirstFrame: " + thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.extractFirstFrame$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C189200o6.m2constructorimpl(str);
        interfaceC1364105Vn.resumeWith(str);
    }
}
