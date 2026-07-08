package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ba7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978930ba7 extends AbstractC21673619ry<C978940ba8> {
    public final Function1<GiftMode, Unit> LL;
    public GiftMode LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return C978520bZS.LIZIZ().size();
    }

    public C978930ba7(AwS594S0100000_15 awS594S0100000_15) {
        this.LL = awS594S0100000_15;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        GiftMode giftMode = (GiftMode) ListProtector.get(C978520bZS.LIZIZ(), i);
        if (giftMode == null || giftMode.giftId != 0) {
            return 0;
        }
        return 1;
    }

    public static void LLLFZ(C978940ba8 c978940ba8, int i) {
        String uri;
        long jLJIIIIZZ;
        GiftMode giftMode = (GiftMode) ListProtector.get(C978520bZS.LIZIZ(), i);
        c978940ba8.setIsRecyclable(false);
        c978940ba8.LLJILJILJ = giftMode;
        if (giftMode != null) {
            C978930ba7 c978930ba7 = c978940ba8.LLJILLL;
            C0JSS.LIZLLL(c978940ba8.LL, giftMode.giftIconImage);
            C16F5 c16f5 = c978940ba8.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(String.valueOf(giftMode.giftPrice));
            }
            boolean z = true;
            if (giftMode.giftId == 0) {
                C16F5 c16f52 = c978940ba8.LLILZ;
                if (c16f52 != null) {
                    c16f52.setText(C497740JfY.LJIJI(2131843046));
                }
                C16F5 c16f53 = c978940ba8.LLILZIL;
                if (c16f53 != null) {
                    c16f53.setText(C497740JfY.LJIJI(2131843047));
                }
                C786410Ut5.LJLLLLLL(8, c978940ba8.LLILLJJLI);
            } else {
                if (giftMode.labelText.length() > 0) {
                    c978940ba8.LLJIJIL.setText(giftMode.labelText);
                    C500260Jjc.LLFFF(c978940ba8.LLJILJIL);
                } else {
                    C500260Jjc.LJIILIIL(c978940ba8.LLJILJIL);
                }
                ImageModel imageModel = giftMode.eventIconImage;
                if (imageModel != null && (uri = imageModel.getUri()) != null && uri.length() > 0 && EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue()) {
                    C786410Ut5.LJZL(0, c978940ba8.LLJ);
                    C786410Ut5.LLJJIII(c978940ba8.LLJI, 0);
                    C1819620xS4.LIZ().LJIIIZ(giftMode.eventIconImage).LJJI(c978940ba8.LLJI);
                } else {
                    C786410Ut5.LJZL(8, c978940ba8.LLJ);
                    C786410Ut5.LLJJIII(c978940ba8.LLJI, 8);
                }
                C16F5 c16f54 = c978940ba8.LLILZ;
                if (c16f54 != null) {
                    c16f54.setText(C497740JfY.LJIJJ(2131843041, giftMode.giftName));
                }
                C16F5 c16f55 = c978940ba8.LLILZIL;
                if (c16f55 != null) {
                    c16f55.setText(C497740JfY.LJIJJ(2131843048, giftMode.giftName));
                }
                C786410Ut5.LJLLLLLL(0, c978940ba8.LLILLJJLI);
            }
            C20744016Fi c20744016Fi = c978940ba8.LLILZLL;
            if (c20744016Fi != null) {
                long j = giftMode.giftId;
                GiftMode giftMode2 = c978930ba7.LLILLJJLI;
                if (giftMode2 != null) {
                    jLJIIIIZZ = giftMode2.giftId;
                } else {
                    jLJIIIIZZ = C978520bZS.LJIIIIZZ();
                }
                if (j != jLJIIIIZZ) {
                    z = false;
                }
                c20744016Fi.setChecked(z);
            }
            C500260Jjc.LJLIIIL(500L, c978940ba8.itemView, new AwS381S0200000_15(c978930ba7, giftMode, 24));
            ImageModel imageModel2 = giftMode.giftBackgroundImage;
            if (imageModel2 != null) {
                C0JSS.LIZLLL(c978940ba8.LLIZ, imageModel2);
                C1324720kZq c1324720kZq = c978940ba8.LLIZ;
                if (c1324720kZq != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 0);
                    return;
                }
                return;
            }
            C1324720kZq c1324720kZq2 = c978940ba8.LLIZ;
            if (c1324720kZq2 == null) {
                return;
            }
            C786410Ut5.LLJJIII(c1324720kZq2, 8);
        }
    }

    @Override // X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LLLFZ((C978940ba8) viewHolder, i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C978940ba8 c978940ba8;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i == 1) {
            c978940ba8 = new C978940ba8(this, C786410Ut5.Td(layoutInflaterNe, R.layout.gsu, viewGroup, false));
        } else {
            c978940ba8 = new C978940ba8(this, C786410Ut5.Td(layoutInflaterNe, R.layout.gsv, viewGroup, false));
        }
        try {
            View view = c978940ba8.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c978940ba8.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c978940ba8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C978940ba8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c978940ba8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c978940ba8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C978940ba8.class.getName();
        return c978940ba8;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        Long l;
        C978940ba8 c978940ba8 = (C978940ba8) viewHolder;
        if (list.size() <= 0) {
            LLLFZ(c978940ba8, i);
            return;
        }
        GiftMode giftMode = (GiftMode) ListProtector.get(C978520bZS.LIZIZ(), i);
        boolean z = false;
        Long lValueOf = null;
        if ((ListProtector.get(list, 0) instanceof Long) && (l = (Long) ListProtector.get(list, 0)) != null) {
            c978940ba8.getClass();
            l.longValue();
            C20744016Fi c20744016Fi = c978940ba8.LLILZLL;
            if (c20744016Fi != null) {
                if (giftMode != null) {
                    lValueOf = Long.valueOf(giftMode.giftId);
                }
                c20744016Fi.setChecked(Intrinsics.LJFF(lValueOf, l));
            }
            l.longValue();
            return;
        }
        C20744016Fi c20744016Fi2 = c978940ba8.LLILZLL;
        if (c20744016Fi2 == null) {
            return;
        }
        if (giftMode != null && giftMode.giftId == C978520bZS.LJIIIIZZ()) {
            z = true;
        }
        c20744016Fi2.setChecked(z);
    }
}
