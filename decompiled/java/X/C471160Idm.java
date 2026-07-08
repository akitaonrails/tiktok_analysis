package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.model.FeedItem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Idm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471160Idm extends C2217421BqW implements Function1<C469770IbX, C0IYZ> {
    public C471160Idm(Object obj) {
        super(1, obj, C471250Idv.class, "createAdapterProvider", "createAdapterProvider(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/BaseDrawerFeedLiveAdapterProvider;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IYZ invoke(C469770IbX c469770IbX) {
        final C469770IbX c469770IbX2 = c469770IbX;
        this.receiver.getClass();
        return new C0IYZ(c469770IbX2) { // from class: X.0IYj
            @Override // X.C0IYZ
            public final Map<Integer, InterfaceC468510IYv> LIZIZ() {
                return C2097608Jq.LJIIJ(new Pair(Integer.valueOf(R.layout.gd_), new InterfaceC468510IYv() { // from class: X.0IYk
                    @Override // X.InterfaceC468510IYv
                    public final AbstractC468490IYt LIZ(ViewGroup viewGroup, Object[] objArr) {
                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
                        if (iGameService != null) {
                            return iGameService.xb1(layoutInflaterNe, viewGroup);
                        }
                        return null;
                    }
                }), new Pair(Integer.valueOf(R.layout.gd9), new InterfaceC468510IYv() { // from class: X.0IYl
                    @Override // X.InterfaceC468510IYv
                    public final AbstractC468490IYt LIZ(ViewGroup viewGroup, Object[] objArr) {
                        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gd9, viewGroup, false);
                        return new AbstractC468490IYt<FeedItem>(viewTd) { // from class: X.0IYn
                            @Override // X.AbstractC468490IYt
                            public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
                            }
                        };
                    }
                }));
            }

            @Override // X.C0IYZ
            public final InterfaceC468510IYv LIZLLL() {
                return new InterfaceC468510IYv() { // from class: X.0IYi
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
                    @Override // X.InterfaceC468510IYv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.AbstractC468490IYt LIZ(android.view.ViewGroup r5, java.lang.Object[] r6) {
                        /*
                            r4 = this;
                            android.content.Context r0 = r5.getContext()
                            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
                            r1 = 2131569760(0x7f0d2c60, float:1.8765156E38)
                            r0 = 0
                            android.view.View r3 = X.C786410Ut5.Td(r2, r1, r5, r0)
                            int r1 = r6.length
                            r0 = 4
                            if (r1 <= r0) goto L26
                            r2 = r6[r0]
                            boolean r0 = r2 instanceof X.C11RK
                            if (r0 == 0) goto L26
                            X.11RK r2 = (X.C11RK) r2
                        L1c:
                            X.0IYh r1 = new X.0IYh
                            X.0IYj r0 = r4.LIZ
                            X.0IbX r0 = r0.LIZ
                            r1.<init>(r3, r2, r0)
                            return r1
                        L26:
                            r2 = 0
                            goto L1c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C468380IYi.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                };
            }

            @Override // X.C0IYZ
            public final C470660Icy LIZ(final Map<Integer, InterfaceC468510IYv> map) {
                return new C470660Icy(map) { // from class: X.0IYm
                    @Override // X.C470660Icy, X.AbstractC471430IeD
                    public final int LLLLIILL(int i) {
                        if (i != 1008) {
                            if (i != 1009) {
                                return super.LLLLIILL(i);
                            }
                            return R.layout.gd9;
                        }
                        return R.layout.gd_;
                    }
                };
            }
        };
    }
}
