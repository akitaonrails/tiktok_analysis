package X;

/* JADX INFO: renamed from: X.0NfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.surveybutton.BottomSurveyButtonClickEvent", f = "FeedBottomSurveySensor.kt", l = {220}, m = "invoke")
public final class C599490NfH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C599830Nfp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599490NfH(C599830Nfp c599830Nfp, InterfaceC1364105Vn<? super C599490NfH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c599830Nfp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomSurveyButtonClickEvent@6221.invoke$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.invoke(null, null, this);
        C1C7U.LIZIZ("BottomSurveyButtonClickEvent@6221.invoke$1");
        return objLIZ;
    }
}
