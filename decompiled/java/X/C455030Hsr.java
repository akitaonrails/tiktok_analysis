package X;

import android.util.SparseArray;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Hsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM$sendMessage$1", f = "SendMessageVM.kt", l = {}, m = "invokeSuspend")
public final class C455030Hsr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SendMessageVM LL;
    public final /* synthetic */ List<RichTextInfo> LLILLJJLI;
    public final /* synthetic */ BaseContent LLILLL;
    public final /* synthetic */ SessionInfo LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ C455010Hsp LLILZLL;
    public final /* synthetic */ C454390Hrp LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map<String, String> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455030Hsr(SendMessageVM sendMessageVM, List<RichTextInfo> list, BaseContent baseContent, SessionInfo sessionInfo, C869590Y9l c869590Y9l, C455010Hsp c455010Hsp, C454390Hrp c454390Hrp, String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C455030Hsr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sendMessageVM;
        this.LLILLJJLI = list;
        this.LLILLL = baseContent;
        this.LLILZ = sessionInfo;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = c455010Hsp;
        this.LLIZ = c454390Hrp;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455030Hsr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, okio.ByteString] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SendMessageVM@2f1e.sendMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SendMessageVM sendMessageVM = this.LL;
        List<RichTextInfo> list = this.LLILLJJLI;
        BaseContent baseContent = this.LLILLL;
        String conversationId = this.LLILZ.getConversationId();
        SessionInfo sessionInfo = this.LLILZ;
        C869590Y9l c869590Y9l = this.LLILZIL;
        C455010Hsp c455010Hsp = this.LLILZLL;
        C454390Hrp c454390Hrp = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        String str3 = this.LLJ;
        Map<String, String> map = this.LLJI;
        sendMessageVM.getClass();
        C0ZDT.LIZ.getClass();
        String inputAutoFilledSyncExt = null;
        Map mapLJFF = C0ZDT.LJFF(c869590Y9l, null, sessionInfo, c455010Hsp, str3);
        if (map != null) {
            mapLJFF.putAll(map);
        }
        ReferenceInfo referenceInfoLJII = C0ZDT.LJII(c869590Y9l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLIZ = C0ZDT.LIZ(list, sessionInfo, c455010Hsp);
        if (c455010Hsp != null && !c455010Hsp.LIZ) {
            if (sessionInfo != null) {
                inputAutoFilledSyncExt = sessionInfo.getInputAutoFilledSyncExt();
            }
            if (C123100dR.LIZ(inputAutoFilledSyncExt) && sessionInfo != null && sessionInfo.getInputAutoFilledAweType() == 711 && baseContent != null) {
                baseContent.type = 711;
            }
        }
        C259800zU c259800zU = new C259800zU();
        if (c454390Hrp != null) {
            if (c454390Hrp.LIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("has_link", str);
            String str4 = c454390Hrp.LIZIZ;
            if (str4 != null) {
                linkedHashMap.put("html_link", str4);
            }
        }
        if (c455010Hsp != null || C123100dR.LIZ(str2)) {
            if (str2 != null && str2.length() > 0) {
                linkedHashMap.put("a:client_reply_uuids", str2);
            }
            c259800zU.element = C0ZDT.LIZJ(c455010Hsp, str2);
        }
        ByteString byteStringLIZIZ = C0ZDT.LIZIZ(str3);
        if (C455040Hss.LIZ()) {
            if (conversationId != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(sendMessageVM), null, null, new C459830I1l(conversationId, baseContent, mapLJFF, c259800zU, mapLIZ, linkedHashMap, byteStringLIZIZ, referenceInfoLJII, null), 3);
            }
        } else {
            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
            C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
            c874730YTfLIZ.LIZIZ.LJFF = conversationId;
            c874730YTfLIZ.LIZIZ(baseContent);
            C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
            c0ytz.LJIJ = referenceInfoLJII;
            c0ytz.LJIILIIL = linkedHashMap;
            SparseArray<Object> sparseArrayLJ = C901060ZWm.LJ(mapLJFF);
            C0YTZ c0ytz2 = c874730YTfLIZ.LIZIZ;
            c0ytz2.LJIILL = sparseArrayLJ;
            c0ytz2.LJIIJJI = (ByteString) c259800zU.element;
            c0ytz2.LJIIIZ = mapLIZ;
            c0ytz2.LJIIJ = byteStringLIZIZ;
            c874730YTfLIZ.LIZ();
            c874730YTfLIZ.LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageVM@2f1e.sendMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
