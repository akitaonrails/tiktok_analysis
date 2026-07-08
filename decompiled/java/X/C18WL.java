package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18WL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.component.AiChatSaveComponent$saveToGallery$2", f = "AiChatSaveComponent.kt", l = {}, m = "invokeSuspend")
public final class C18WL extends C09AX implements Function2<InterfaceC1157570gEF<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC1157570gEF<String>> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C18WR LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ AIChatGenNode LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18WL(InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0u, Context context, C18WR c18wr, String str, long j, AIChatGenNode aIChatGenNode, String str2, InterfaceC1364105Vn<? super C18WL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC332260D0u;
        this.LLILLL = context;
        this.LLILZ = c18wr;
        this.LLILZIL = str;
        this.LLILZLL = j;
        this.LLIZ = aIChatGenNode;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18WL c18wl = new C18WL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c18wl.LL = obj;
        return c18wl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJ;
        C1C7U.LIZ("AiChatSaveComponent@8e0a.saveToGallery$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        this.LLILLJJLI.setValue((InterfaceC1157570gEF<String>) obj2);
        Activity activityLIZ = C0FNT.LIZ(this.LLILLL);
        if (activityLIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveToGallery$2");
            return unit;
        }
        if (obj2 instanceof C1157450gE3) {
            C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
            c1389880mGw.LJIIIZ(C21291518Tx.LJ(EnumC21291418Tw.DOWNLOADED_TOAST, new Object[0]));
            c1389880mGw.LJ(R.raw.icon_tick_circle_fill);
            c1389880mGw.LJI(R.attr.a1h);
            c1389880mGw.LIZLLL(2000L);
            c1389880mGw.LJIIJ();
            C18UP c18up = C18UP.LIZ;
            C18UJ c18ujG2 = this.LLILZ.G2();
            String str = this.LLILZIL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZLL;
            AIChatGenNode aIChatGenNode = this.LLIZ;
            c18up.getClass();
            C0LAB c0lab = new C0LAB();
            C18UP.LIZ(c0lab, c18ujG2);
            C18UP.LIZIZ(c0lab, aIChatGenNode);
            c0lab.LJ("vp_enter_from", str);
            c0lab.LJ("download_duration", String.valueOf(jCurrentTimeMillis));
            C20684815ws.LJIILLIIL("vp_download_success", c0lab.LIZ);
            C18T2 c18t2 = C18T2.LIZ;
            String str2 = this.LLIZLLLIL;
            c18t2.getClass();
            C18T2.LJ("ai_chat_image_save_local_duration", str2);
            C18T2.LJI("ai_chat_image_save_local_success", true);
        } else if (obj2 instanceof C1155990gBh) {
            if (C1332270km1.LIZIZ(UriProtector.parse(this.LLIZLLLIL))) {
                strLJ = this.LLILLL.getString(2131837145);
            } else {
                strLJ = C21291518Tx.LJ(EnumC21291418Tw.DOWNLOAD_FAILED_TOAST, new Object[0]);
            }
            C1389880mGw c1389880mGw2 = new C1389880mGw(activityLIZ);
            c1389880mGw2.LJIIIZ(strLJ);
            c1389880mGw2.LJI(R.attr.a1h);
            c1389880mGw2.LIZLLL(2000L);
            c1389880mGw2.LJIIJ();
            C18T2.LIZ.getClass();
            C18T2.LJI("ai_chat_image_save_local_success", false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveToGallery: url=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", state=");
        sbLIZ.append(obj2);
        C21290818Tq.LIZJ("AiChatSaveComponent", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveToGallery$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends String> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
