package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM$loadCoverBitmap$2", f = "StoryHighlightsCreationVM.kt", l = {536}, m = "invokeSuspend")
public final class C467601ru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ UrlModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C467601ru(Context context, UrlModel urlModel, InterfaceC1364105Vn<? super C467601ru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C467601ru(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List<String> urlList;
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.loadCoverBitmap$2");
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
            C0I2Q c0i2q = C0I2Q.LIZ;
            Context context = this.LLILLJJLI;
            UrlModel urlModel = this.LLILLL;
            Uri uri = null;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList);
            } else {
                str = null;
            }
            this.LL = 1;
            if (str != null) {
                c0i2q.getClass();
                uri = UriProtector.parse(str);
            }
            c0i2q.getClass();
            obj = C0I2Q.LIZ(context, uri, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadCoverBitmap$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadCoverBitmap$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
