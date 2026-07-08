package X;

import Y.AfS153S0200000_17;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117000fAo extends AbstractC1116980fAm {
    public final C11NJ LLILLL = new C11NJ();

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        this.LLILLL.dispose();
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ISendCommentEvent.Sender sender;
        ISendCommentEvent c1114470f6j;
        InterfaceC1117010fAp interfaceC1117010fAp = (InterfaceC1117010fAp) xBaseParamModel;
        String content = interfaceC1117010fAp.getContent();
        if (content == null) {
            C2382909Vj.LIZ(completionBlock, 0, "content is null", null, 4);
            return;
        }
        if (Intrinsics.LJFF(interfaceC1117010fAp.getSender(), "lottery")) {
            sender = ISendCommentEvent.Sender.LOTTERY;
        } else {
            sender = ISendCommentEvent.Sender.UNKNOWN;
        }
        String type = interfaceC1117010fAp.getType();
        if (Intrinsics.LJFF(type, "text")) {
            c1114470f6j = new C1114480f6k(content, null, false, 0, sender, C2097608Jq.LJ());
        } else if (Intrinsics.LJFF(type, "barrage")) {
            c1114470f6j = new C1114470f6j(content, sender, C2097608Jq.LJ());
        } else {
            throw new IllegalArgumentException("unsupported comment type");
        }
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        this.LLILLL.LIZ(new C11IE(c784440UpuLIZ.LJ(C1114490f6l.class).LJJIL(new C1151830g4z(c1114470f6j, 0))).LJIILLIIL(new AfS153S0200000_17(this, completionBlock, 10)));
        C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(c784440UpuLIZ, c1114470f6j, 49));
    }
}
