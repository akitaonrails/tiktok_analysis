package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.NoticeButton;
import webcast.api.feed.NoticeItem;
import webcast.api.feed.NoticeUIInfo;

/* JADX INFO: renamed from: X.0IzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484430IzB extends FrameLayout implements InterfaceC1141530foN {
    public C424560Gko LL;
    public C197039127h LLILLJJLI;
    public TuxIconView LLILLL;
    public NoticeUIInfo LLILZ;
    public NoticeItem LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public int LLIZ;

    public final int getJumpType() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        NoticeButton noticeButton;
        InterfaceC1107590evd interfaceC1107590evd;
        LiveEventModule liveEventModuleLIZ;
        C197039127h c197039127h;
        C197039127h c197039127h2;
        NoticeUIInfo noticeUIInfo = this.LLILZ;
        if (noticeUIInfo == null || (noticeButton = noticeUIInfo.button) == null || noticeButton.buttonType != 2 || !Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (liveEventModuleLIZ = C477390Inp.LIZ(interfaceC1107590evd)) == null) {
            return;
        }
        String string = null;
        if (liveEventModuleLIZ.subscribed) {
            String str = liveEventModuleLIZ.id;
            NoticeItem noticeItem = this.LLILZIL;
            if (noticeItem != null) {
                string = Long.valueOf(noticeItem.eventId).toString();
            }
            if (Intrinsics.LJFF(str, string) && (c197039127h2 = this.LLILLJJLI) != null) {
                C339190DRl.LIZIZ(c197039127h2);
                return;
            }
            return;
        }
        String str2 = liveEventModuleLIZ.id;
        NoticeItem noticeItem2 = this.LLILZIL;
        if (noticeItem2 != null) {
            string = Long.valueOf(noticeItem2.eventId).toString();
        }
        if (!Intrinsics.LJFF(str2, string) || (c197039127h = this.LLILLJJLI) == null) {
            return;
        }
        C339190DRl.LIZLLL(c197039127h);
    }

    public final void setJumpType(int i) {
        this.LLIZ = i;
    }

    public C484430IzB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
