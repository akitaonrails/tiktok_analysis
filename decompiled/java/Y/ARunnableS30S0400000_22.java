package Y;

import X.C137700fn;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1445960njO;
import X.C1457270o1d;
import X.C1605650rsx;
import X.C1C7U;
import X.C2188811AlT;
import X.C737030Svd;
import X.C786410Ut5;
import X.EnumC1615506Uf;
import X.InterfaceC1446740nke;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS30S0400000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1457270o1d c1457270o1d = C1457270o1d.LIZ;
        ImageView imageView = (ImageView) this.l0;
        c1457270o1d.getClass();
        C1457270o1d.LIZ(imageView);
        C1457270o1d.LIZIZ((ImageView) this.l0);
        ((ImageView) this.l0).setBackground((GradientDrawable) this.l1);
        ((InterfaceC1446740nke) this.l2).Ps().setValue(Boolean.TRUE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[legacy] placeholder visible, parentSize=");
        sbLIZ.append(((FrameLayout) this.l3).getWidth());
        sbLIZ.append('x');
        sbLIZ.append(((FrameLayout) this.l3).getHeight());
        C1457270o1d.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.0nmd] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.0TkK] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS30S0400000_22 r15) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0400000_22.run$0(Y.ARunnableS30S0400000_22):void");
    }

    public static final void run$1(ARunnableS30S0400000_22 aRunnableS30S0400000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditorThumbnailPlaceholderHelper@e902.setupLegacy$1");
        try {
            aRunnableS30S0400000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorThumbnailPlaceholderHelper@e902.setupLegacy$1");
    }

    public static final void run$2(ARunnableS30S0400000_22 aRunnableS30S0400000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditorThumbnailPlaceholderHelper@e902.setupLegacy$2$1");
        try {
            if (!C1457270o1d.LIZIZ) {
                C786410Ut5.LJJJJ((Bitmap) aRunnableS30S0400000_22.l0);
                C1457270o1d.LIZ.getClass();
                C1457270o1d.LJ("[legacy] bitmap recycled on main thread, placeholder was cleared");
            } else {
                ((ImageView) aRunnableS30S0400000_22.l1).setScaleType((ImageView.ScaleType) aRunnableS30S0400000_22.l2);
                ((InterfaceC1446740nke) aRunnableS30S0400000_22.l3).lk().setValue((Bitmap) aRunnableS30S0400000_22.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorThumbnailPlaceholderHelper@e902.setupLegacy$2$1");
    }

    public static final void run$3(ARunnableS30S0400000_22 aRunnableS30S0400000_22) {
        Boolean bool;
        C1445960njO c1445960njO = (C1445960njO) aRunnableS30S0400000_22.l0;
        CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) aRunnableS30S0400000_22.l1;
        PublishModel publishModel = (PublishModel) aRunnableS30S0400000_22.l3;
        c1445960njO.getClass();
        C1C7U.LIZ("AwemePublishCallback@8484.onSuccess$1L");
        Activity activityLIZ = C1445960njO.LIZ();
        if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse;
            CreateAwemeResponse.ResponseMarker responseMarker = createAwemeResponse.responseMarker;
            if (responseMarker != null && (bool = responseMarker.addToPlaylistFail) != null && bool.booleanValue() && activityLIZ != null) {
                String string = activityLIZ.getResources().getString(2131834356);
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
            Aweme aweme = createAwemeResponse.aweme;
            if (aweme != null || !((Boolean) C137700fn.LIZ.getValue()).booleanValue()) {
                AwemeBizExtKt.setScheduleId(aweme, publishModel.creationId);
                if (aweme.getAuthor() != null) {
                    aweme.getAuthor().setStoryStatus(C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, AwemeExtKt.getAuthorUid(aweme)));
                }
                C737030Svd c737030Svd = new C737030Svd(15, aweme);
                c737030Svd.LJIIZILJ = publishModel;
                C1440005kM.LIZIZ(c737030Svd);
            }
        }
        C1C7U.LIZIZ("AwemePublishCallback@8484.onSuccess$1L");
    }

    public ARunnableS30S0400000_22(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public ARunnableS30S0400000_22(C1445960njO c1445960njO, CreateBaseAwemeResponse createBaseAwemeResponse, int i, Object obj, PublishModel publishModel, int i2) {
        this.$t = i2;
        this.l0 = c1445960njO;
        this.l1 = createBaseAwemeResponse;
        this.l2 = obj;
        this.l3 = publishModel;
    }
}
