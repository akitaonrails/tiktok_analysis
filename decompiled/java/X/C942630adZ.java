package X;

import Y.ACListenerS150S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0adZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942630adZ extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final DataChannel LL;
    public final String LLILLJJLI;
    public List<? extends AbstractC1882307Yv> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILLL, i);
        if (obj instanceof C1882207Yu) {
            return 0;
        }
        if (obj instanceof C1882407Yw) {
            return 1;
        }
        if (obj instanceof C1882507Yx) {
            return 2;
        }
        throw new C1954807lC();
    }

    public C942630adZ(DataChannel dataChannel, String str) {
        this.LL = dataChannel;
        this.LLILLJJLI = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestToolAndPlayAdapter_init source:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = C13BV.INSTANCE;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        AbstractC1882307Yv abstractC1882307Yv = (AbstractC1882307Yv) ListProtector.get(this.LLILLL, i);
        if (abstractC1882307Yv instanceof C1882207Yu) {
            ((C942810adr) viewHolder).LL.setText(((C1882207Yu) abstractC1882307Yv).LIZ);
            return;
        }
        if (abstractC1882307Yv instanceof C1882407Yw) {
            C942790adp c942790adp = (C942790adp) viewHolder;
            c942790adp.getClass();
            int i3 = C942700adg.LIZ[((C1882407Yw) abstractC1882307Yv).LIZ.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    c942790adp.LLILLL.setIconRes(R.raw.icon_image_alt_1_fill);
                    c942790adp.LLILZ.setText(2131843396);
                    C786410Ut5.I7(new ACListenerS150S0100000_15(c942790adp, 46), c942790adp.LLILLJJLI);
                    return;
                }
                throw new C1954807lC();
            }
            c942790adp.LLILLL.setIconRes(R.raw.icon_billboard_ltr);
            if (MultiguestNoticeboardV2Setting.INSTANCE.templateEnable()) {
                i2 = 2131854991;
            } else {
                i2 = 2131853923;
            }
            c942790adp.LLILZ.setText(i2);
            C786410Ut5.I7(new ACListenerS150S0100000_15(c942790adp, 45), c942790adp.LLILLJJLI);
            return;
        }
        if (abstractC1882307Yv instanceof C1882507Yx) {
            C942680ade c942680ade = (C942680ade) viewHolder;
            C1882507Yx c1882507Yx = (C1882507Yx) abstractC1882307Yv;
            c942680ade.getClass();
            int i4 = C942660adc.LIZ[c1882507Yx.LIZ.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                c942680ade.LLILZ.setText(C20642515q3.LJI(2131854430));
                                c942680ade.LLILZIL.setText(C20642515q3.LJI(2131854471));
                                c942680ade.LLILZLL.setIconRes(R.raw.icon_dance_fill);
                                C500260Jjc.LJLIIIL(500L, c942680ade.LL, new AwS594S0100000_15(c942680ade, 1224));
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            c942680ade.LLILZ.setText(2131854478);
                            c942680ade.LLILZIL.setText(2131854720);
                            c942680ade.LLILZLL.setIconRes(R.raw.icon_three_person_fill);
                            C500260Jjc.LJLIIIL(500L, c942680ade.LL, AFwS250S0000000_15.get$arr$(266));
                        }
                    } else {
                        c942680ade.LLILZ.setText(2131852903);
                        c942680ade.LLILZIL.setText(2131852939);
                        c942680ade.LLILZLL.setIconRes(R.raw.icon_crown_fill);
                        C500260Jjc.LJLIIIL(500L, c942680ade.LL, new AwS594S0100000_15(c942680ade, 1223));
                    }
                } else {
                    c942680ade.LLILZ.setText(2131853920);
                    c942680ade.LLILZIL.setText(2131853919);
                    c942680ade.LLILZLL.setIconRes(R.raw.icon_double_timer_fill);
                    C500260Jjc.LJLIIIL(500L, c942680ade.LL, new AwS594S0100000_15(c942680ade, 1222));
                }
            } else {
                c942680ade.LLILZ.setText(2131843568);
                c942680ade.LLILZIL.setText(2131853922);
                c942680ade.LLILZLL.setIconRes(R.raw.icon_disco_ball_fill);
                C500260Jjc.LJLIIIL(500L, c942680ade.LL, new AwS594S0100000_15(c942680ade, 1225));
            }
            C500260Jjc.LJLJLJ(c942680ade.LLIZ, c1882507Yx.LIZJ);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c942810adr;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c942810adr = new C942680ade(C786410Ut5.Td(layoutInflaterNe, R.layout.dpi, viewGroup, false), this.LL, this.LLILLJJLI);
                } else {
                    throw new IllegalArgumentException("Invalid view type");
                }
            } else {
                c942810adr = new C942790adp(C786410Ut5.Td(layoutInflaterNe, R.layout.dpk, viewGroup, false), this.LL);
            }
        } else {
            c942810adr = new C942810adr(C786410Ut5.Td(layoutInflaterNe, R.layout.dpj, viewGroup, false));
        }
        try {
            View view = c942810adr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c942810adr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c942810adr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c942810adr.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c942810adr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c942810adr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c942810adr.getClass().getName();
        return c942810adr;
    }
}
