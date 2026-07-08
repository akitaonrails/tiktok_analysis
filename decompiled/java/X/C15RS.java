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
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15RS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15RS extends RecyclerView {
    public C15RT LL;
    public C0DUA LLILLJJLI;
    public float LLILLL;
    public C15RV LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public final float getScrollDx() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (i == 1) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotationY(180.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.LLILZIL = true;
        } else if (motionEvent.getAction() == 0) {
            this.LLILZLL = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            C15RT c15rt = this.LL;
            C0DUA c0dua = null;
            if (c15rt == null) {
                c15rt = null;
            }
            c15rt.setAudioWaveViewData(aVMusicWaveBean);
            C0DUA c0dua2 = this.LLILLJJLI;
            if (c0dua2 != null) {
                c0dua = c0dua2;
            }
            setAdapter(c0dua);
        }
    }

    public final void setProgressMaxWidth(int i) {
        C15RT c15rt = this.LL;
        if (c15rt == null) {
            c15rt = null;
        }
        c15rt.setProgressMaxWidth(i);
    }

    public final void setScrollDx(float f) {
        this.LLILLL = f;
    }

    public final void setScrollListener(C15RV c15rv) {
        this.LLILZ = c15rv;
    }

    public final void setWaveColor(int i) {
        C15RT c15rt = this.LL;
        if (c15rt == null) {
            c15rt = null;
        }
        c15rt.setColor(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DUA] */
    public C15RS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipToPadding(false);
        this.LL = new C15RT(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        linearLayoutManager.setReverseLayout(C1388580mEq.LIZIZ(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.LLILLJJLI = new AbstractC21673619ry<RecyclerView.ViewHolder>() { // from class: X.0DUA
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return 1;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                final C15RT c15rt = this.LL.LL;
                if (c15rt == null) {
                    c15rt = null;
                }
                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c15rt) { // from class: X.0DUB
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
                            stringBuffer.append(C0DUB.class.getName());
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
                C20612085q.LIZ = C0DUB.class.getName();
                return viewHolder;
            }
        };
        addOnScrollListener(new AsS56S0100000_31(this, 4));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
