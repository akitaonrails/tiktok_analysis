package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20385614pi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookAnchorServiceV2 LL;
    public final /* synthetic */ C20386714pt LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20385614pi(PlaybookAnchorServiceV2 playbookAnchorServiceV2, C20386714pt c20386714pt, C013C c013c) {
        super(0);
        this.LL = playbookAnchorServiceV2;
        this.LLILLJJLI = c20386714pt;
        this.LLILLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) this.LL.LLILLJJLI;
        if (playbookAnchorViewModel == null) {
            return null;
        }
        C20386714pt c20386714pt = this.LLILLJJLI;
        InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>> interfaceC170900l9 = c20386714pt.LJIIIZ;
        Playbook playbook = c20386714pt.LIZ;
        C20389714qN c20389714qN = c20386714pt.LIZIZ;
        Long lValueOf = c20389714qN != null ? Long.valueOf(c20389714qN.LIZ) : null;
        C20389714qN c20389714qN2 = this.LLILLJJLI.LIZIZ;
        Long lValueOf2 = c20389714qN2 != null ? Long.valueOf(c20389714qN2.LIZIZ) : null;
        C20389714qN c20389714qN3 = this.LLILLJJLI.LIZIZ;
        Long lValueOf3 = c20389714qN3 != null ? Long.valueOf(c20389714qN3.LIZJ) : null;
        C20386714pt c20386714pt2 = this.LLILLJJLI;
        String str2 = c20386714pt2.LJIIIIZZ;
        String str3 = c20386714pt2.LIZJ;
        String str4 = c20386714pt2.LIZLLL;
        boolean z = c20386714pt2.LJI;
        String str5 = c20386714pt2.LJ;
        String str6 = "";
        if (c20386714pt2.LJFF) {
            str = str3;
        } else {
            str = "";
            str6 = str3;
        }
        PlaybookAnchorViewModel.SQ2(playbookAnchorViewModel, interfaceC170900l9, playbook, lValueOf, lValueOf2, lValueOf3, str2, null, str3, str4, z, str5, str, str6, c20386714pt2.LJII, this.LLILLL.element, false, 98304);
        return Unit.LIZ;
    }
}
