package X;

import Y.AkS472S0100000_8;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0MCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564710MCv extends AbstractC2255721DQs<C0MD4> implements C0MD4, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C0MC7.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(260));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0L31.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C564710MCv.class, "aiUploadImageApi", "getAiUploadImageApi()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveUploadImageApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C564710MCv.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C564710MCv.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C564710MCv.class, "aiLiveQuotaV2Api", "getAiLiveQuotaV2Api()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveQuotaV2Api;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLIZLLLIL = 8;
    }

    public C0MD4 o2() {
        return this;
    }

    private final C0L31 X1() {
        return (C0L31) this.LLILZLL.getValue(this, LLIZ[3]);
    }

    private final C0MC7 Z1() {
        return (C0MC7) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZ[1]);
    }

    public final C564650MCp W1() {
        return (C564650MCp) this.LLILZIL.getValue();
    }

    public final Context getContext() {
        return (Context) this.LLILZ.getValue(this, LLIZ[2]);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C564710MCv(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0MD4
    public AbstractC19484711Kz<C0MD3> o82(String str, String str2, final PromptModel promptModel) {
        final String string = str2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generate: userPrompt=");
        sbLIZ.append(string);
        sbLIZ.append(",imagePath=");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c0l76, "AILiveWritingComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (a0.LJLIIIL(string).toString().length() == 0) {
            string = getContext().getString(2131820733);
        }
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = jCurrentTimeMillis;
        return Z1().qP2(str).LJJI(new InterfaceC1487280oo2() { // from class: X.0MD1
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return AbstractC19484711Kz.LJIILLIIL(new C0MD2(2000, (Throwable) obj));
            }
        }).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0MCz
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str3 = (String) obj;
                c238400w2.element = System.currentTimeMillis();
                final C564710MCv c564710MCv = this;
                final String str4 = string;
                return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0MCx
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<C0MD3> interfaceC2329309At) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Android_");
                        sbLIZ2.append(UUID.randomUUID());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C564740MCy(CoroutineExceptionHandler.LJJLIL, strLIZIZ, (C11KT) interfaceC2329309At))), null, null, new C564720MCw(c564710MCv, str4, str3, strLIZIZ, interfaceC2329309At, null), 3);
                    }
                });
            }
        }).LJJIJIIJIL(C0C64.LJIILLIIL().LJIJJLI(31744, 10000L, "studio_ai_live_new_prompt_page_ai_writer_timeout", true), TimeUnit.MILLISECONDS).LJJII(new AkS472S0100000_8(this, 8)).LJIILL(new C09JN() { // from class: X.0MD0
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AILiveWritingComponent@eca8.generate$4");
                this.LL.w2((C0MD3) obj, jCurrentTimeMillis, c238400w2.element, promptModel);
                C1C7U.LIZIZ("AILiveWritingComponent@eca8.generate$4");
            }
        });
    }

    public final void w2(C0MD3 c0md3, long j, long j2, PromptModel promptModel) {
        Integer numValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        PromptPageMobParam promptPageMobParam = getEditModel().getAILivePhotoModel().mobParam;
        int i = c0md3.LIZ;
        if (i != 0) {
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = null;
        }
        promptPageMobParam.aiWriteLastFailReason = numValueOf;
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        int iRz0 = X1().rz0();
        c564410MBr.getClass();
        C20684815ws.LJIILLIIL("ai_writing_result_show", C564410MBr.LIZ(editModel, iRz0, true, true, true, new C564440MBu(editModel, jCurrentTimeMillis - j, j2 - j, promptModel)).LIZ);
    }
}
