package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: renamed from: X.0nQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434010nQ7 extends AbstractC1433570nPP {
    public boolean LIZ;
    public final C1433990nQ5 LIZIZ;
    public final /* synthetic */ C1433500nPI LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0nQ5, X.12Az] */
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
    public C1434010nQ7(final C1433500nPI c1433500nPI) {
        this.LIZJ = c1433500nPI;
        ?? r1 = new C1434040nQA() { // from class: X.0nQ5
            @Override // X.C1434040nQA, X.InterfaceC19713512Az
            public final void onAppBackground() {
                if (c1433500nPI.LLILZIL.LIZ.publishType != 0) {
                    return;
                }
                BaseShortVideoContext baseShortVideoContext = this.LIZJ.LLILZIL.LIZ.editModel;
                if (baseShortVideoContext instanceof VideoPublishEditModel) {
                    VideoPublishEditModelKt videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext;
                    videoPublishEditModelKt.setOpenForegroundPublish(false);
                    videoPublishEditModelKt.setBackgroundPublish(true);
                }
            }
        };
        this.LIZIZ = r1;
        C19712912At.LIZ.LJ(r1);
    }

    @Override // X.AbstractC1433570nPP
    public final void onProgress(int i, Object obj) {
        if (this.LIZJ.LLILZIL.LIZ.publishType == 0 && !this.LIZ && C19712912At.LIZ.LIZJ()) {
            BaseShortVideoContext baseShortVideoContext = this.LIZJ.LLILZIL.LIZ.editModel;
            if (baseShortVideoContext instanceof VideoPublishEditModel) {
                VideoPublishEditModelKt videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext;
                videoPublishEditModelKt.setOpenForegroundPublish(false);
                videoPublishEditModelKt.setBackgroundPublish(true);
            }
            this.LIZ = true;
        }
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        C19712912At.LIZ.LJFF(this.LIZIZ);
    }
}
