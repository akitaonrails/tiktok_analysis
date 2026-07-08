package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0986, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel$loadThumbnailBitmap$1$1", f = "AlbumUpdateGuideViewModel.kt", l = {285}, m = "invokeSuspend")
public final class AnonymousClass0986 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;
    public final /* synthetic */ AlbumUpdateGuideViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0986(Context context, MediaModel mediaModel, AlbumUpdateGuideViewModel albumUpdateGuideViewModel, InterfaceC1364105Vn<? super AnonymousClass0986> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = mediaModel;
        this.LLILZ = albumUpdateGuideViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0986(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        AnonymousClass0987 anonymousClass0987;
        C1C7U.LIZ("AlbumUpdateGuideViewModel@c21.loadThumbnailBitmap$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C23216097u c23216097u = C23215097t.LIZ;
            Context context = this.LLILLJJLI;
            MediaModel mediaModel = this.LLILLL;
            Size size = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(88))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(145))));
            this.LL = 1;
            obj = C23215097t.LJI(context, mediaModel, size, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AlbumUpdateGuideViewModel@c21.loadThumbnailBitmap$1$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        C2252321DDq c2252321DDq = this.LLILZ.LLJI;
        MediaModel mediaModel2 = this.LLILLL;
        do {
            value = c2252321DDq.getValue();
            if (bitmap != null) {
                anonymousClass0987 = new AnonymousClass0987(bitmap, mediaModel2.LJIILJJIL());
            } else {
                anonymousClass0987 = null;
            }
        } while (!c2252321DDq.compareAndSet(value, anonymousClass0987));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumUpdateGuideViewModel@c21.loadThumbnailBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
