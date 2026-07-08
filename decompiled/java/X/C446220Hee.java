package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmapFromInfoStickerAsset$1$1", f = "StickerItemView.kt", l = {751, 754}, m = "invokeSuspend")
public final class C446220Hee extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C367470Eav LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446220Hee(C367470Eav c367470Eav, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c367470Eav;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446220Hee(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Size sizeLIZIZ = C20137413qm.LIZ.LIZIZ(this.LLILLL.LLLIZZ, this.LLILLJJLI);
            Context context = this.LLILLL.getContext();
            String str = this.LLILLJJLI;
            int height = sizeLIZIZ.getHeight();
            int width = sizeLIZIZ.getWidth();
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final Uri uriFromFile = Uri.fromFile(new C0VSJ(str));
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.LJFF = false;
            C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
            final int iMax = Math.max(width, height);
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uriFromFile);
            c1325700kbQLIZLLL.LJFF = c1329360khK;
            c1325700kbQLIZLLL.LIZJ = new C1324630kZh(iMax, iMax);
            ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), context)).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0Hef
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                    if (thLIZLLL != null) {
                        thLIZLLL.printStackTrace();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("webp file parser fail, path -> ");
                    sbLIZ.append(uriFromFile.getPath());
                    sbLIZ.append(", exception ->");
                    sbLIZ.append(interfaceC1320200kSY.LIZLLL());
                    C201955140j.LJIILIIL("EditorProImageLoader", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                    try {
                        if (result == null) {
                            return;
                        }
                        try {
                            AbstractC1327750kej abstractC1327750kej = result.get();
                            if (abstractC1327750kej instanceof C1325120kaU) {
                                Bitmap underlyingBitmap = ((C1325120kaU) abstractC1327750kej).getUnderlyingBitmap();
                                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn = c23260099m;
                                C189200o6.m2constructorimpl(underlyingBitmap);
                                interfaceC1364105Vn.resumeWith(underlyingBitmap);
                            } else if (abstractC1327750kej instanceof C1329380khM) {
                                InterfaceC1329600khi interfaceC1329600khiLIZ = ((C1329380khM) abstractC1327750kej).LIZ();
                                if (interfaceC1329600khiLIZ == null) {
                                    C1323050kX9.LJII(result);
                                    return;
                                }
                                InterfaceC1329960kiI frame = interfaceC1329600khiLIZ.getFrame(1);
                                int i2 = iMax;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                                int i3 = iMax;
                                frame.renderFrame(i3, i3, bitmapCreateBitmap);
                                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn2 = c23260099m;
                                C189200o6.m2constructorimpl(bitmapCreateBitmap);
                                interfaceC1364105Vn2.resumeWith(bitmapCreateBitmap);
                            }
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("webp file parser fail, path -> ");
                            sbLIZ.append(uriFromFile.getPath());
                            C201955140j.LJIILIIL("EditorProImageLoader", C2188811AlT.LIZIZ(sbLIZ));
                            InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn3 = c23260099m;
                            C189200o6.m2constructorimpl(null);
                            interfaceC1364105Vn3.resumeWith(null);
                        }
                        C1323050kX9.LJII(result);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(result);
                        throw th;
                    }
                }
            }, C822700WPc.LL);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0E73 c0e73 = new C0E73(this.LLILLL, bitmap, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0e73) == objLJFF) {
            C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
