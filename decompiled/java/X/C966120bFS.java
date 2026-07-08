package X;

import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;
import webcast.im.P2PGroupChangeContent;

/* JADX INFO: renamed from: X.0bFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966120bFS extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ Map<Long, CohostUserInfo> LL;
    public final /* synthetic */ C259800zU<P2PGroupChangeContent> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<List<VirtualWaitingUser>> LLILZ;
    public final /* synthetic */ C259800zU<Map<Long, CohostABInfo>> LLILZIL;
    public final /* synthetic */ C259800zU<GamePlayContent> LLILZLL;
    public final /* synthetic */ C259800zU<Map<Long, GuestUserInfo>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966120bFS(Map<Long, CohostUserInfo> map, C259800zU<P2PGroupChangeContent> c259800zU, C259800zU<String> c259800zU2, C259800zU<List<VirtualWaitingUser>> c259800zU3, C259800zU<Map<Long, CohostABInfo>> c259800zU4, C259800zU<GamePlayContent> c259800zU5, C259800zU<Map<Long, GuestUserInfo>> c259800zU6) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = c259800zU4;
        this.LLILZLL = c259800zU5;
        this.LLIZ = c259800zU6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LJLIL(this.LL, this.LLILLJJLI.element, this.LLILLL.element, this.LLILZ.element, this.LLILZIL.element, this.LLILZLL.element, this.LLIZ.element);
        return Unit.LIZ;
    }
}
