package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0K extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0E0B LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ ResourceItem LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;
    public final /* synthetic */ C0E0I LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0K(C0E0B c0e0b, NLETrackSlot nLETrackSlot, boolean z, ResourceItem resourceItem, int i, InterfaceC497601wk interfaceC497601wk, C0E0I c0e0i) {
        super(0);
        this.LL = c0e0b;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = z;
        this.LLILZ = resourceItem;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC497601wk;
        this.LLIZ = c0e0i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AsyncTasksPanelViewModel asyncTasksPanelViewModel;
        C377120EqU c377120EqU = C377120EqU.LIZ;
        C0E0B c0e0b = this.LL;
        VideoPublishEditModel videoPublishEditModel = c0e0b.LIZLLL;
        C0E48 c0e48 = c0e0b.LIZIZ;
        c377120EqU.getClass();
        C377120EqU.LJIIIIZZ(videoPublishEditModel, c0e48, "click_apply");
        C0E0B c0e0b2 = this.LL;
        String strLJII = C352250DrT.LJII(this.LLILLJJLI);
        if (strLJII == null) {
            strLJII = "";
        }
        C381540Exc c381540ExcLJII = c0e0b2.LJII(strLJII);
        if (Intrinsics.LJFF(c381540ExcLJII != null ? c381540ExcLJII.LJ : null, "STARTED") && (asyncTasksPanelViewModel = this.LL.LJ) != null) {
            List listSingletonList = Collections.singletonList(c381540ExcLJII);
            C377390Eqv c377390Eqv = new C377390Eqv(false, false, false, false, 15);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                arrayList.add(AsyncTasksPanelViewModel.HQ2((C381540Exc) it2.next()));
            }
            asyncTasksPanelViewModel.yQ2(arrayList, c377390Eqv);
        }
        this.LL.LIZIZ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
