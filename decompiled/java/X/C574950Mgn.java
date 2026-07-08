package X;

import com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Mgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tangram.parser.BasicModelParser", f = "BasicModelParser.kt", l = {29}, m = "onParser")
public final class C574950Mgn extends AbstractC23140094w {
    public BasicModelCompat LL;
    public VideoPublishEditModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C574940Mgm LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574950Mgn(C574940Mgm c574940Mgm, InterfaceC1364105Vn<? super C574950Mgn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c574940Mgm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicModelParser@a6b1.onParser$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZ(null, null, this);
        C1C7U.LIZIZ("BasicModelParser@a6b1.onParser$1");
        return objLIZJ;
    }
}
