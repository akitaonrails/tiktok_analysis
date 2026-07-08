package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.LiveBoardsBroadcastWidget;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationWidget;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.widget.LiveBoardsDisplayViewWidget;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.widget.LivePreviewBoardTipsViewWidget;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ERI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERI extends C09AY implements Function0<C1091950eWP> {
    public C1ERI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eWP] */
    @Override // kotlin.jvm.functions.Function0
    public final C1091950eWP invoke() {
        return new InterfaceC781460Ul6() { // from class: X.0eWP
            public final ConcurrentHashMap<String, MutableLiveData<C1078550eAn>> LIZ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC781460Ul6
            public final C19719912Dl LIZ() {
                return C13LE.LIZ(PreviewBulletinEditWidget.class);
            }

            @Override // X.InterfaceC781460Ul6
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(LiveBoardsDisplayViewWidget.class);
            }

            @Override // X.InterfaceC781460Ul6
            public final C19719912Dl LJI() {
                return C13LE.LIZ(LivePreviewBoardTipsViewWidget.class);
            }

            @Override // X.InterfaceC781460Ul6
            public final C19719912Dl LJIIJJI() {
                return C13LE.LIZ(PcsAudienceDecorationAssem.class);
            }

            @Override // X.InterfaceC781460Ul6
            public final void LIZJ() {
                AbstractC19484711Kz.LJII(new C1839600xyI(false));
            }

            @Override // X.InterfaceC781460Ul6
            public final LiveBoardsBroadcastWidget LJIIIIZZ() {
                return new LiveBoardsBroadcastWidget();
            }

            @Override // X.InterfaceC781460Ul6
            public final Class<? extends LiveRecyclableWidget> LJ() {
                return PcsAudienceDecorationWidget.class;
            }

            @Override // X.InterfaceC781460Ul6
            public final View LIZLLL(ViewGroup viewGroup) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hfo, viewGroup, false);
                viewGroup.addView(viewTd);
                return viewTd;
            }

            public static String LJIIL(EnumC1083620eIy enumC1083620eIy, String str) {
                if (enumC1083620eIy != null) {
                    int i = C1083630eIz.LIZ[enumC1083620eIy.ordinal()];
                    if (i != 1 && i != 2) {
                        return LivePreviewCTASmartDisplayManager.DEFAULT;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1083620eIy.name());
                    sbLIZ.append('_');
                    sbLIZ.append(str);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return LivePreviewCTASmartDisplayManager.DEFAULT;
            }

            @Override // X.InterfaceC781460Ul6
            public final MutableLiveData LJII(EnumC1083620eIy enumC1083620eIy, String str) {
                MutableLiveData<C1078550eAn> mutableLiveDataPutIfAbsent;
                String strLJIIL = LJIIL(enumC1083620eIy, str);
                ConcurrentHashMap<String, MutableLiveData<C1078550eAn>> concurrentHashMap = this.LIZ;
                MutableLiveData<C1078550eAn> mutableLiveData = concurrentHashMap.get(strLJIIL);
                if (mutableLiveData == null && (mutableLiveDataPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIIL, (mutableLiveData = new MutableLiveData<>()))) != null) {
                    mutableLiveData = mutableLiveDataPutIfAbsent;
                }
                return mutableLiveData;
            }

            @Override // X.InterfaceC781460Ul6
            public final void LJIIJ(EnumC1083620eIy enumC1083620eIy, String str) {
                MutableLiveData<C1078550eAn> mutableLiveDataRemove = this.LIZ.remove(LJIIL(enumC1083620eIy, str));
                if (mutableLiveDataRemove != null) {
                    mutableLiveDataRemove.setValue(null);
                }
            }

            @Override // X.InterfaceC781460Ul6
            public final void LJIIIZ(C1078550eAn c1078550eAn, EnumC1083620eIy enumC1083620eIy, String str) {
                Long lValueOf;
                MutableLiveData<C1078550eAn> mutableLiveDataPutIfAbsent;
                MutableLiveData<C1078550eAn> mutableLiveDataPutIfAbsent2;
                String strLJIIL = LJIIL(enumC1083620eIy, str);
                ConcurrentHashMap<String, MutableLiveData<C1078550eAn>> concurrentHashMap = this.LIZ;
                MutableLiveData<C1078550eAn> mutableLiveData = concurrentHashMap.get(strLJIIL);
                if (mutableLiveData == null && (mutableLiveDataPutIfAbsent2 = concurrentHashMap.putIfAbsent(strLJIIL, (mutableLiveData = new MutableLiveData<>()))) != null) {
                    mutableLiveData = mutableLiveDataPutIfAbsent2;
                }
                mutableLiveData.setValue(c1078550eAn);
                StringBuilder sb = new StringBuilder("LiveSdkPcsDecorationService setPcsAudienceBoardData key=");
                sb.append(strLJIIL);
                sb.append(" action=");
                sb.append(c1078550eAn.LIZIZ);
                sb.append(" boardId=");
                Board board = c1078550eAn.LIZ;
                if (board != null) {
                    lValueOf = Long.valueOf(board.id);
                } else {
                    lValueOf = null;
                }
                sb.append(lValueOf);
                sb.append(", liveData=");
                ConcurrentHashMap<String, MutableLiveData<C1078550eAn>> concurrentHashMap2 = this.LIZ;
                MutableLiveData<C1078550eAn> mutableLiveData2 = concurrentHashMap2.get(strLJIIL);
                if (mutableLiveData2 == null && (mutableLiveDataPutIfAbsent = concurrentHashMap2.putIfAbsent(strLJIIL, (mutableLiveData2 = new MutableLiveData<>()))) != null) {
                    mutableLiveData2 = mutableLiveDataPutIfAbsent;
                }
                sb.append(mutableLiveData2.hashCode());
                Logger.i("pcs_audience_decoration", sb.toString());
            }

            @Override // X.InterfaceC781460Ul6
            public final void LJFF(int i, long j, long j2, long j3) {
                ConcurrentHashMap<Long, C1145500fum> concurrentHashMapPutIfAbsent;
                if (j > 0 && j2 > 0) {
                    try {
                        ConcurrentHashMap<Long, ConcurrentHashMap<Long, C1145500fum>> concurrentHashMap = C1145410fud.LIZ;
                        Long lValueOf = Long.valueOf(j);
                        ConcurrentHashMap<Long, C1145500fum> concurrentHashMap2 = concurrentHashMap.get(lValueOf);
                        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                        }
                        if (concurrentHashMap2.putIfAbsent(Long.valueOf(j2), new C1145500fum(j, j2, i, j3, C1145410fud.LIZJ, C1145410fud.LJ)) == null) {
                            C1145410fud.LJFF(j, j2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        };
    }
}
