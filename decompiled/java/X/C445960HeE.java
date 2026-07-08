package X;

import Y.ACListenerS110S0200000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445960HeE extends AbstractC21673619ry<C445890He7> {
    public final Function1<LiveEffect, Unit> LL;
    public int LLILLJJLI;
    public List<? extends LiveEffect> LLILLL = C13BV.INSTANCE;
    public final Set<Integer> LLILZ = new LinkedHashSet();
    public final EnumC771350UNp LLILZIL = EnumC771350UNp.MULTI_GUEST_EMOJI_ICON;
    public final /* synthetic */ C445880He6 LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public C445960HeE(C445880He6 c445880He6, C5183020f c5183020f) {
        this.LLILZLL = c445880He6;
        this.LL = c5183020f;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<String> list;
        C445890He7 c445890He7 = (C445890He7) viewHolder;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c445890He7.itemView.getLayoutParams();
        int i2 = this.LLILLJJLI;
        if (i2 > 0 && marginLayoutParams.width != i2) {
            marginLayoutParams.width = i2;
            C786410Ut5.W5(c445890He7.itemView, marginLayoutParams);
        }
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LLILLL, i);
        UrlModel icon = liveEffect.getIcon();
        if (icon != null && (list = icon.urlList) != null && !list.isEmpty()) {
            C786410Ut5.LLJJIII(c445890He7.LL, 0);
            C0VSJ c0vsj = new C0VSJ(this.LLILZIL.getFullPath(), liveEffect.getResourceId());
            if (c0vsj.exists()) {
                c445890He7.LL.setImageURI(Uri.fromFile(c0vsj));
            } else {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(list);
                c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
                c1324610kZfLIZJ.LJJI(c445890He7.LL);
            }
            if (i < 6 && !this.LLILZ.contains(Integer.valueOf(i))) {
                this.LLILZ.add(Integer.valueOf(i));
                C445880He6 c445880He6 = this.LLILZLL;
                View view = c445890He7.itemView;
                c445880He6.getClass();
                C786410Ut5.Ob(view, 0.0f);
                C786410Ut5.pc(view, 0.0f);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 0.0f, 1.2f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 0.0f, 1.2f));
                objectAnimatorOfPropertyValuesHolder.setDuration(209L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 1.2f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 1.2f, 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(125L);
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(((long) i) * 42);
                animatorSet.playSequentially(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
                animatorSet.start();
                return;
            }
            C786410Ut5.Ob(c445890He7.itemView, 1.0f);
            C786410Ut5.pc(c445890He7.itemView, 1.0f);
            return;
        }
        C786410Ut5.LLJJIII(c445890He7.LL, 8);
        c445890He7.LL.setImageDrawable(null);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C445890He7 c445890He7 = new C445890He7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h8_, viewGroup, false));
        C786410Ut5.e8(c445890He7.LL, new ACListenerS110S0200000_6(c445890He7, this, 2));
        try {
            View view = c445890He7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c445890He7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c445890He7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C445890He7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c445890He7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c445890He7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C445890He7.class.getName();
        return c445890He7;
    }
}
