package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS30S2000000_11;

/* JADX INFO: renamed from: X.0RcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699550RcH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C699090RbX<ComponentPriorityProtocol> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ VideoItemParams LLILZIL;
    public final /* synthetic */ C699060RbU LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699550RcH(C699090RbX<ComponentPriorityProtocol> c699090RbX, boolean z, String str, Aweme aweme, VideoItemParams videoItemParams, C699060RbU c699060RbU, String str2, String str3) {
        super(0);
        this.LL = c699090RbX;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = videoItemParams;
        this.LLILZLL = c699060RbU;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LLJI.compareAndSet(false, true)) {
            final C700450Rdj c700450RdjVN0 = this.LL.LL.vN0();
            new C699580RcK(this.LLILZ, this.LLILLL, this.LLIZ, this.LLIZLLLIL, this.LLILZLL);
            C0T6L.LIZLLL();
            if (this.LLILLJJLI) {
                C700410Rdf c700410Rdf = C700410Rdf.LIZ;
                String str = this.LLILLL;
                Aweme aweme = this.LLILZ;
                C699090RbX<ComponentPriorityProtocol> c699090RbX = this.LL;
                VideoItemParams videoItemParams = this.LLILZIL;
                Integer numValueOf = videoItemParams != null ? Integer.valueOf(videoItemParams.currentPosition) : null;
                c700410Rdf.getClass();
                C700410Rdf.LJI(str, aweme, c699090RbX, numValueOf, "video", c700450RdjVN0);
            } else if (this.LLILZLL.LJJIIZ()) {
                ExecutorService executorServiceLJFF = C20684815ws.LJFF();
                final String str2 = this.LLILLL;
                final Aweme aweme2 = this.LLILZ;
                final C699090RbX<ComponentPriorityProtocol> c699090RbX2 = this.LL;
                final VideoItemParams videoItemParams2 = this.LLILZIL;
                final String str3 = this.LLIZ;
                final String str4 = this.LLIZLLLIL;
                executorServiceLJFF.submit(new Runnable() { // from class: X.0RcI
                    public final void LIZ() {
                        new C699590RcL(str2, str3, str4, aweme2);
                        C0T6L.LIZLLL();
                        C700410Rdf c700410Rdf2 = C700410Rdf.LIZ;
                        String str5 = str2;
                        Aweme aweme3 = aweme2;
                        C699090RbX<ComponentPriorityProtocol> c699090RbX3 = c699090RbX2;
                        VideoItemParams videoItemParams3 = videoItemParams2;
                        Integer numValueOf2 = videoItemParams3 != null ? Integer.valueOf(videoItemParams3.currentPosition) : null;
                        C700450Rdj c700450Rdj = c700450RdjVN0;
                        c700410Rdf2.getClass();
                        C700410Rdf.LJI(str5, aweme3, c699090RbX3, numValueOf2, "video", c700450Rdj);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ComponentPriorityMaker@4add.internalMobComponentShow$showTask$1$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ComponentPriorityMaker@4add.internalMobComponentShow$showTask$1$2");
                    }
                });
            } else {
                C700410Rdf c700410Rdf2 = C700410Rdf.LIZ;
                String str5 = this.LLILLL;
                Aweme aweme3 = this.LLILZ;
                C699090RbX<ComponentPriorityProtocol> c699090RbX3 = this.LL;
                VideoItemParams videoItemParams3 = this.LLILZIL;
                Integer numValueOf2 = videoItemParams3 != null ? Integer.valueOf(videoItemParams3.currentPosition) : null;
                c700410Rdf2.getClass();
                C700410Rdf.LJI(str5, aweme3, c699090RbX3, numValueOf2, "video", c700450RdjVN0);
            }
            final C699090RbX<ComponentPriorityProtocol> c699090RbX4 = this.LL;
            C699060RbU c699060RbU = this.LLILZLL;
            final LifecycleOwner lifecycleOwner = c699060RbU.LLJILJILJ;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            final String str6 = this.LLILLL;
            Aweme aweme4 = c699060RbU.LLJILLL;
            final boolean zLJJIIZ = c699060RbU.LJJIIZ();
            final C700470Rdl c700470Rdl = (C700470Rdl) c699090RbX4.LLJILLL.getValue();
            c700470Rdl.getClass();
            final String aid = aweme4 != null ? aweme4.getAid() : null;
            new C699600RcM(aid, str6);
            C0T6L.LIZLLL();
            c700470Rdl.LJ.invoke();
            final View viewXb = c699090RbX4.LL.xb();
            if (viewXb.isAttachedToWindow()) {
                new C699610RcN(aid, str6);
                C0T6L.LIZLLL();
                c700470Rdl.LIZLLL.invoke(lifecycleOwner, c699090RbX4, str6, aid, Boolean.valueOf(zLJJIIZ));
            }
            viewXb.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0RcJ
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    new AwS30S2000000_11(aid, str6, 0);
                    C0T6L.LIZLLL();
                    c700470Rdl.LIZLLL.invoke(lifecycleOwner, c699090RbX4, str6, aid, Boolean.valueOf(zLJJIIZ));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    new AwS30S2000000_11(aid, str6, 1);
                    C0T6L.LIZLLL();
                    c700470Rdl.LJ.invoke();
                    viewXb.removeOnAttachStateChangeListener(this);
                }
            });
        }
        return Unit.LIZ;
    }
}
