package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell$loadPublishingAwemeCover$1$1", f = "StoryGalleryCoverCell.kt", l = {181}, m = "invokeSuspend")
public final class C08ZP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ StoryGalleryCoverCell LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZP(String str, StoryGalleryCoverCell storyGalleryCoverCell, Aweme aweme, InterfaceC1364105Vn<? super C08ZP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = storyGalleryCoverCell;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1");
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
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.LLILLJJLI);
            if (bitmapDecodeFile == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2141508aD c2141508aD = new C2141508aD(this.LLILLL, this.LLILZ, bitmapDecodeFile, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2141508aD) == objLJFF) {
                C1C7U.LIZIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
