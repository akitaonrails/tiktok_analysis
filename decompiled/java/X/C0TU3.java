package X;

/* JADX INFO: renamed from: X.0TU3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TU3 implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL = "faq_topic_list";
    public final /* synthetic */ String LLILZ;

    public C0TU3(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZ = str3;
    }

    public final void LIZ() {
        C0TU5 c0tu5 = C0TU5.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c0tu5.getClass();
        C0TU5.LIZ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("faq_id", this.LL);
        c2344009Gk.LJIIIIZZ("faq_type", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("faq_list_type", this.LLILLL);
        c2344009Gk.LJIIIIZZ("faq_topic", this.LLILZ);
        C20684815ws.LJIILLIIL("show_topics_question", c2344009Gk.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackShowTopicsQuestion$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackShowTopicsQuestion$1");
    }
}
