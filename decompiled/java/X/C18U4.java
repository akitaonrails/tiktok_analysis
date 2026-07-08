package X;

import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetUserComponent;
import com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18U4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageActionComponent$retrySendMessage$1", f = "AiChatMessageActionComponent.kt", l = {}, m = "invokeSuspend")
public final class C18U4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ C18U0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18U4(C869590Y9l c869590Y9l, C18U0 c18u0, InterfaceC1364105Vn<? super C18U4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = c18u0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18U4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        String str;
        String uuid;
        String str2;
        String str3;
        String str4;
        C1C7U.LIZ("AiChatMessageActionComponent@634.retrySendMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VisualPoetUserCardTemplate visualPoetUserCardTemplate = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(this.LL, VisualPoetUserCardTemplate.class);
        if (visualPoetUserCardTemplate != null) {
            C869590Y9l c869590Y9l = this.LL;
            C18U0 c18u0 = this.LLILLJJLI;
            List<C0YC6> attachments = c869590Y9l.getAttachments();
            if (attachments != null) {
                arrayList = new ArrayList();
                for (C0YC6 c0yc6 : attachments) {
                    if (c0yc6.index == 0 && (str4 = c0yc6.localPath) != null && str4.length() != 0) {
                        arrayList.add(new C21295818Vo("", str4, c0yc6.getOriginalWidth(), c0yc6.getOriginalHeight(), c0yc6.length, false, (EnumC1778830wOH) null, 224));
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            Map<String, String> map = visualPoetUserCardTemplate.extra;
            if (map != null) {
                str = map.get("client_task_id");
            } else {
                str = null;
            }
            String uuid2 = c869590Y9l.getUuid();
            VisualPoetUserComponent visualPoetUserComponent = visualPoetUserCardTemplate.userContentComponent;
            String str5 = visualPoetUserComponent.text;
            String str6 = visualPoetUserComponent.promptUri;
            Map<String, String> map2 = visualPoetUserCardTemplate.extra;
            C18UZ c18uz = new C18UZ(uuid2, str5, null, map2, str6, arrayList);
            AiChatRoomFeatureApi aiChatRoomFeatureApiW2 = c18u0.w2();
            if (str == null) {
                uuid = c869590Y9l.getUuid();
            } else {
                uuid = str;
            }
            aiChatRoomFeatureApiW2.eT1(uuid);
            c18u0.PH0(c18uz, c18u0.G2(), true);
            C18UP c18up = C18UP.LIZ;
            C18UJ c18ujG2 = c18u0.G2();
            String str7 = "";
            if (map2 == null || (str2 = map2.get("prompt_type")) == null) {
                str2 = "";
            }
            int size = arrayList.size();
            if (map2 != null && (str3 = map2.get("preload_image_status")) != null) {
                str7 = str3;
            }
            c18up.getClass();
            C18UP.LJIIJJI(c18ujG2, str2, size, "success", true, str7, C18UP.LIZLLL(arrayList), str);
        }
        if (this.LLILLJJLI.H2(this.LL)) {
            this.LLILLJJLI.zk2(this.LL, EnumC212372189a.HIDE_USER_CONTENT);
        } else {
            this.LLILLJJLI.zk2(this.LL, EnumC212372189a.DELETE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageActionComponent@634.retrySendMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
