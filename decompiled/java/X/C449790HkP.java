package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449790HkP implements InterfaceC450890HmB {
    public final Function2<StickerItem, Rect, Unit> LIZ;

    @Override // X.InterfaceC450890HmB
    @InterfaceC1294060jmO
    public final void LIZ(View view, C451030HmP c451030HmP) {
    }

    @Override // X.InterfaceC450890HmB
    public final void LIZJ() {
    }

    @Override // X.InterfaceC450890HmB
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC450890HmB
    public final void LJ() {
    }

    @Override // X.InterfaceC450890HmB
    @InterfaceC1294060jmO
    public final void LJFF(InterfaceC449850HkV interfaceC449850HkV, Rect rect) {
    }

    @Override // X.InterfaceC450890HmB
    public final void LJI(String str) {
    }

    @Override // X.InterfaceC450890HmB
    public final void Op() {
    }

    @Override // X.InterfaceC450890HmB
    public final void ji(String str, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC450890HmB
    public final void zm(CommentPersonalizedEmoji commentPersonalizedEmoji) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C449790HkP(Function2<? super StickerItem, ? super Rect, Unit> function2) {
        this.LIZ = function2;
    }

    @Override // X.InterfaceC450890HmB
    public final void LIZIZ(StickerItem stickerItem, Rect rect) {
        this.LIZ.invoke(stickerItem, rect);
    }
}
