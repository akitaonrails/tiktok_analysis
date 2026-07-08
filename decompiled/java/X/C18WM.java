package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.18WM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.component.AiChatSaveComponent$saveForPost$job$1", f = "AiChatSaveComponent.kt", l = {141}, m = "invokeSuspend")
public final class C18WM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C18WR LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AIChatGenNode LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC1157570gEF<String>> LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18WM(C18WR c18wr, String str, AIChatGenNode aIChatGenNode, String str2, InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0u, Context context, InterfaceC1364105Vn<? super C18WM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c18wr;
        this.LLILZ = str;
        this.LLILZIL = aIChatGenNode;
        this.LLILZLL = str2;
        this.LLIZ = interfaceC332260D0u;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18WM c18wm = new C18WM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c18wm.LLILLJJLI = obj;
        return c18wm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("AiChatSaveComponent@8e0a.saveForPost$job$1");
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
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C18UP c18up = C18UP.LIZ;
            C18UJ c18ujG2 = this.LLILLL.G2();
            AIChatGenChatRoomModel aIChatGenChatRoomModel = this.LLILLL.G2().LJ.chatRoomModel;
            if (aIChatGenChatRoomModel != null) {
                str = aIChatGenChatRoomModel.entranceType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "comment")) {
                str2 = "add_to_comment";
            } else {
                str2 = "post";
            }
            String str3 = this.LLILZ;
            AIChatGenNode aIChatGenNode = this.LLILZIL;
            c18up.getClass();
            C18UP.LJII(c18ujG2, str2, str3, aIChatGenNode);
            C18T2 c18t2 = C18T2.LIZ;
            String str4 = this.LLILZLL;
            c18t2.getClass();
            C18T2.LIZIZ("ai_chat_image_download_duration", str4);
            final InterfaceC332260D0u interfaceC332260D0uOo = this.LLILLL.H2().oo(this.LLILZLL, ".png", 3);
            final C18WR c18wr = this.LLILLL;
            final AIChatGenNode aIChatGenNode2 = this.LLILZIL;
            final String str5 = this.LLILZLL;
            C2501109r7 c2501109r7 = new C2501109r7(new C342420Dbc(null), C09IC.LJIL(new InterfaceC346201Wa<InterfaceC1157570gEF<? extends String>>() { // from class: X.18WN
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends String>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = interfaceC332260D0uOo.collect(new C18WP(interfaceC346701Wf, c18wr, aIChatGenNode2, str5), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            }, C0PEM.LIZJ), 0);
            final InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0u = this.LLIZ;
            final String str6 = this.LLILZLL;
            final C18WR c18wr2 = this.LLILLL;
            final Context context = this.LLIZLLLIL;
            InterfaceC346701Wf<Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.18WO
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    String string;
                    InterfaceC1157570gEF<String> interfaceC1157570gEF = (InterfaceC1157570gEF) obj2;
                    interfaceC332260D0u.setValue(interfaceC1157570gEF);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("saveForPost: url=");
                    sbLIZ.append(str6);
                    sbLIZ.append(", state=");
                    sbLIZ.append(interfaceC1157570gEF);
                    C21290818Tq.LIZJ("AiChatSaveComponent", C2188811AlT.LIZIZ(sbLIZ));
                    if (interfaceC1157570gEF instanceof C1157580gEG) {
                        C1157580gEG c1157580gEG = (C1157580gEG) interfaceC1157570gEF;
                        c18wr2.i3(context, (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ), c1157580gEG.LIZ);
                        DialogC1390150mHN dialogC1390150mHN = c18wr2.LLJ;
                        if (dialogC1390150mHN != null) {
                            dialogC1390150mHN.LJJLL(c1157580gEG.LIZ, false);
                        }
                    } else if (interfaceC1157570gEF instanceof C1157450gE3) {
                        c18wr2.W2();
                    } else if (interfaceC1157570gEF instanceof C1155990gBh) {
                        Activity activityLIZ = C0FNT.LIZ(context);
                        if (activityLIZ != null) {
                            String str7 = str6;
                            Context context2 = context;
                            if (C1332270km1.LIZIZ(UriProtector.parse(str7))) {
                                string = context2.getString(2131837145);
                            } else {
                                string = context2.getString(2131834217);
                            }
                            C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                            c1389880mGw.LJIIIZ(string);
                            c1389880mGw.LIZLLL(2000L);
                            c1389880mGw.LJIIJ();
                        }
                        c18wr2.W2();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2501109r7.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveForPost$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveForPost$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
