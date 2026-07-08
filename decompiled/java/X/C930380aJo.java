package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930380aJo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinkPlayerInfo LL;
    public final /* synthetic */ C931830aM9 LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C930380aJo(LinkPlayerInfo linkPlayerInfo, C931830aM9 c931830aM9, float f) {
        super(0);
        this.LL = linkPlayerInfo;
        this.LLILLJJLI = c931830aM9;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.isFullPositionPreApproved = false;
        this.LLILLJJLI.LLJZIJLIL.setText(C497740JfY.LJIJI(2131840786));
        this.LLILLJJLI.LLJZIJLIL.setEnabled(true);
        this.LLILLJJLI.LLJZIJLIL.j0(R.style.a7s);
        this.LLILLJJLI.LLJZIJLIL.setRadius(this.LLILLL);
        return Unit.LIZ;
    }
}
