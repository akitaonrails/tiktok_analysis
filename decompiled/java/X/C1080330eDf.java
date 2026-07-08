package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMomentQuickCommentWatchliveSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080330eDf extends ElementSpecImpl {
    public final C1080530eDz LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        this.LLILLL = false;
        this.LLILLJJLI = false;
        ConstraintProperty constraintPropertyById = this.LL.getConstraintPropertyById(getId());
        if (constraintPropertyById != null) {
            LIZ(constraintPropertyById);
        }
    }

    public C1080330eDf(C1080530eDz c1080530eDz) {
        super(R.id.o_c);
        this.LL = c1080530eDz;
        addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eDh
            {
                super(R.id.ebi);
            }

            @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
            public final void onHiddenChanged(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, boolean z) {
                C1080330eDf c1080330eDf = this.LIZ;
                if (c1080330eDf.LLILLJJLI == z) {
                    return;
                }
                c1080330eDf.LLILLJJLI = z;
                c1080330eDf.LIZ(constraintProperty);
            }
        });
        addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eDg
            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C1085120eLO> getType() {
                return C1085120eLO.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                C1085120eLO c1085120eLO2 = c1085120eLO;
                if (C1080800eEQ.LIZIZ(layeredElementContext.getDataChannel())) {
                    C1080330eDf c1080330eDf = this.LIZ;
                    c1080330eDf.LLILLL = c1085120eLO2.LIZIZ;
                    c1080330eDf.LLILZ = c1085120eLO2.LIZ;
                    c1080330eDf.LIZ(constraintProperty);
                }
            }
        });
    }

    public final void LIZ(ConstraintProperty constraintProperty) {
        if (this.LLILLL) {
            if (!LiveGameMomentQuickCommentWatchliveSetting.INSTANCE.quiciCommentLandscapeEnable()) {
                constraintProperty.connect(4, R.id.sfq, 3, this.LL.LIZLLL);
                constraintProperty.apply();
                return;
            } else {
                int iLJIILLIIL = C497740JfY.LJIILLIIL() - (this.LLILZ + C497740JfY.LJIIIZ(R.dimen.as5));
                constraintProperty.removeConstraints(4);
                constraintProperty.constrainHeight(iLJIILLIIL - ((int) C497740JfY.LIZIZ(24.0f)));
                constraintProperty.apply();
                return;
            }
        }
        constraintProperty.constrainHeight(0);
        if (this.LLILLJJLI) {
            constraintProperty.connect(4, R.id.cdt, 3, 0);
            constraintProperty.apply();
        } else {
            constraintProperty.connect(4, R.id.ebi, 3, this.LL.LIZLLL);
            constraintProperty.apply();
        }
    }
}
