package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08aD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverCell$loadPublishingAwemeCover$1$1$1", f = "StoryGalleryCoverCell.kt", l = {}, m = "invokeSuspend")
public final class C2141508aD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryGalleryCoverCell LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141508aD(StoryGalleryCoverCell storyGalleryCoverCell, Aweme aweme, Bitmap bitmap, InterfaceC1364105Vn<? super C2141508aD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyGalleryCoverCell;
        this.LLILLJJLI = aweme;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2141508aD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        SmartImageView smartImageView;
        Aweme aweme;
        C1C7U.LIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C727310Sfx item = this.LL.getItem();
        if (item != null && (aweme = item.LL) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LLILLJJLI.getAid())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1$1");
            return unit;
        }
        if (C2141608aE.LIZ() && (smartImageView = this.LL.LLILZIL) != null) {
            smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        SmartImageView smartImageView2 = this.LL.LLILZIL;
        if (smartImageView2 != null) {
            smartImageView2.setImageBitmap(this.LLILLL);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryGalleryCoverCell@9450.loadPublishingAwemeCover$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
