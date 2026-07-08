package X;

import Y.ACListenerS125S0200000_22;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ViewOnClickListenerC1419140n28 extends AbstractC21673619ry<C1419150n29> implements View.OnClickListener, View.OnLongClickListener {
    public final Function0<Unit> LL;
    public final ArrayList<RecommendEffectItem> LLILLJJLI = new ArrayList<>();
    public InterfaceC1415820mwm LLILLL;
    public boolean LLILZ;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public ViewOnClickListenerC1419140n28(AwS566S0100000_22 awS566S0100000_22) {
        this.LL = awS566S0100000_22;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((RecommendEffectItem) ListProtector.get(this.LLILLJJLI, i)).LIZIZ) {
            return EnumC311360CIk.DEFAULT.getValue();
        }
        return EnumC311360CIk.NORMAL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        InterfaceC1415820mwm interfaceC1415820mwm;
        String str;
        C1419150n29 c1419150n29 = (C1419150n29) viewHolder;
        super.onViewAttachedToWindow(c1419150n29);
        RecommendEffectItem recommendEffectItem = c1419150n29.LL;
        if (recommendEffectItem != null && !recommendEffectItem.LIZIZ && (interfaceC1415820mwm = this.LLILLL) != null) {
            int bindingAdapterPosition = c1419150n29.getBindingAdapterPosition();
            RecommendEffectItem recommendEffectItem2 = c1419150n29.LL;
            if (recommendEffectItem2 == null || (str = recommendEffectItem2.id) == null) {
                str = "";
            }
            interfaceC1415820mwm.LIZIZ(bindingAdapterPosition, str);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1466980oHI c1466980oHI;
        C1419150n29 c1419150n29 = (C1419150n29) viewHolder;
        int itemViewType = getItemViewType(i);
        int i2 = 0;
        if (itemViewType == EnumC311360CIk.DEFAULT.getValue()) {
            RecommendEffectItem recommendEffectItem = (RecommendEffectItem) ListProtector.get(this.LLILLJJLI, i);
            c1419150n29.I5();
            boolean z = c1419150n29.LLILZIL.LLILZ;
            ImageView imageView = c1419150n29.LLILZ;
            if (!z) {
                i2 = 4;
            }
            C786410Ut5.LJZI(i2, imageView);
            c1419150n29.LL = recommendEffectItem;
        } else if (itemViewType == EnumC311360CIk.NORMAL.getValue()) {
            RecommendEffectItem recommendEffectItem2 = (RecommendEffectItem) ListProtector.get(this.LLILLJJLI, i);
            c1419150n29.I5();
            c1419150n29.LL = recommendEffectItem2;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(recommendEffectItem2.iconUrl));
            c1325700kbQLIZLLL.LJFF = c1329360khK;
            C1324750kZt.LJIILL(c1325700kbQLIZLLL);
            if (recommendEffectItem2.isTTProp == 1) {
                c1325700kbQLIZLLL.LJIILIIL = new InterfaceC1291910jiv() { // from class: X.0jil
                    @Override // X.InterfaceC1291910jiv
                    public final String getName() {
                        return "recommend_effect_processor";
                    }

                    @Override // X.InterfaceC1291910jiv
                    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
                        return new C592490NLr("recommend_effect_processor");
                    }

                    @Override // X.InterfaceC1291910jiv
                    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width > 100 && height > 100) {
                            int iLIZIZ = C814420VxA.LIZIZ(width * 0.06521739f);
                            int iLIZIZ2 = C814420VxA.LIZIZ(height * 0.06521739f);
                            return abstractC1301670jyf.LJ(bitmap, iLIZIZ, iLIZIZ2, width - (iLIZIZ * 2), height - (iLIZIZ2 * 2), null, false);
                        }
                        return abstractC1301670jyf.LIZJ(bitmap);
                    }
                };
            }
            if (i == 1) {
                c1466980oHI = new C1466980oHI(c1419150n29.LLILZIL, 0);
            } else {
                c1466980oHI = null;
            }
            C1324780kZw.LIZ(c1419150n29.LLILLJJLI, new C1325710kbR[]{c1325700kbQLIZLLL.LIZ()}, c1466980oHI, true, null);
        }
        C786410Ut5.I7(new ACListenerS125S0200000_22(c1419150n29, this, 4), c1419150n29.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1419150n29 c1419150n29 = new C1419150n29(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.td, viewGroup, false));
        try {
            View view = c1419150n29.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1419150n29.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1419150n29.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1419150n29.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1419150n29.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1419150n29.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1419150n29.class.getName();
        return c1419150n29;
    }
}
