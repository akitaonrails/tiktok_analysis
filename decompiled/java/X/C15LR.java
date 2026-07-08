package X;

import Y.AsS56S0100000_31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15LR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LR extends RecyclerView {
    public C15LQ LL;
    public C0H4I LLILLJJLI;
    public float LLILLL;
    public C15LZ LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C15LY LLIZLLLIL;

    public final C15LQ getCutMusicView() {
        C15LQ c15lq = this.LL;
        if (c15lq != null) {
            return c15lq;
        }
        return null;
    }

    public int getMaxCntOnScreen() {
        return getCutMusicView().getMaxCntOnScreen();
    }

    public final float getScrollDx() {
        return this.LLILLL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C15LY c15ly;
        if (motionEvent.getAction() == 1) {
            this.LLILZIL = true;
            C15LY c15ly2 = this.LLIZLLLIL;
            if (c15ly2 != null) {
                c15ly2.LIZJ();
            }
        } else if (motionEvent.getAction() == 0) {
            this.LLILZLL = true;
            C15LY c15ly3 = this.LLIZLLLIL;
            if (c15ly3 != null) {
                c15ly3.LJI();
            }
        } else if (motionEvent.getAction() == 3 && (c15ly = this.LLIZLLLIL) != null) {
            c15ly.onCancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCutMusicTouchListener(C15LY c15ly) {
        this.LLIZLLLIL = c15ly;
    }

    public final void setCutMusicView(C15LQ c15lq) {
        this.LL = c15lq;
    }

    public void setHaptic(boolean z) {
        this.LLIZ = z;
    }

    public void setLoopWaveColor(int i) {
        getCutMusicView().setLoopWaveColor(i);
    }

    public void setOnScrollingListener(C15LZ c15lz) {
        this.LLILZ = c15lz;
    }

    public void setParam(C20503715Kx c20503715Kx) {
        getCutMusicView().setParam(c20503715Kx);
    }

    public final void setScrollDx(float f) {
        this.LLILLL = f;
    }

    public C15LR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0H4I] */
    public C15LR(Context context, AttributeSet attributeSet, int i) {
        float f;
        super(context, attributeSet, i);
        setClipToPadding(false);
        setCutMusicView(new C15LQ(context));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        linearLayoutManager.setReverseLayout(C444960Hcc.LIZJ(context));
        if (C444960Hcc.LIZJ(context)) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f);
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.LLILLJJLI = new AbstractC21673619ry<RecyclerView.ViewHolder>() { // from class: X.0H4I
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return 1;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                final C15LQ cutMusicView = this.LL.getCutMusicView();
                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(cutMusicView) { // from class: X.0H4J
                };
                try {
                    View view = viewHolder.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C0H4J.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i2);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C0H4J.class.getName();
                return viewHolder;
            }
        };
        addOnScrollListener(new AsS56S0100000_31(this, 12));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
