package X;

import Y.ACListenerS11S1101000_6;
import Y.AObserverS210S0100000_6;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Hul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456210Hul extends ConstraintLayout {
    public final List<List<C456220Hum>> LL;
    public AbstractC456130Hud LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public boolean LLILZ;
    public final C456220Hum LLILZIL;

    public final boolean getNeedPlayAnimation() {
        return this.LLILZ;
    }

    public final void setEmojiDataList(List<String> list) {
        final int i;
        C456220Hum c456220Hum;
        int size = list.size();
        if (size < 2) {
            return;
        }
        int iMin = Math.min(size / 2, 4);
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            List list2 = (List) it2.next();
            while (i < iMin) {
                View view = (View) C13LP.LJJJLZIJ(i, list2);
                if (view != null) {
                    C1584506Ih.LIZIZ(view);
                }
                i++;
            }
            for (int i2 = iMin; i2 < 4; i2++) {
                View view2 = (View) C13LP.LJJJLZIJ(i2, list2);
                if (view2 != null) {
                    C1584506Ih.LIZ(view2);
                }
            }
        }
        int i3 = iMin * 2;
        while (i < i3) {
            int i4 = i % iMin;
            List list3 = (List) C13LP.LJJJLZIJ(i / iMin, this.LL);
            if (list3 != null) {
                c456220Hum = (C456220Hum) C13LP.LJJJLZIJ(i4, list3);
            } else {
                c456220Hum = null;
            }
            final String str = (String) C13LP.LJJJLZIJ(i, list);
            if (str == null) {
                str = "";
            }
            if (c456220Hum != null) {
                c456220Hum.setText((CharSequence) C13LP.LJJJLZIJ(i, list));
                this.LLILLL.observe(c456220Hum, new AObserverS210S0100000_6(c456220Hum, 27));
            }
            if (!this.LLILZ) {
                if (c456220Hum != null) {
                    C786410Ut5.W9(c456220Hum, new ACListenerS11S1101000_6(this, str, i, 2));
                }
            } else if (c456220Hum != null) {
                C786410Ut5.W9(c456220Hum, new View.OnClickListener() { // from class: X.0Huo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
                c456220Hum.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Huk
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        C456220Hum c456220Hum2;
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action == 1) {
                                if ((view3 instanceof C456220Hum) && (c456220Hum2 = (C456220Hum) view3) != null) {
                                    c456220Hum2.setSelect(true);
                                }
                                this.LL.LLILLL.postValue(Boolean.TRUE);
                                this.LL.LLILZIL.getLocationOnScreen(new int[2]);
                                PointF pointF = new PointF(r2[0] + (this.LL.LLILZIL.getWidth() / 2), r2[1] + (this.LL.LLILZIL.getHeight() / 2));
                                PointF pointFLJFF = C0S1K.LIZIZ.LJFF();
                                if (pointFLJFF == null) {
                                    pointFLJFF = new PointF(0.0f, 0.0f);
                                }
                                C455290HtH.LIZJ(view3, pointF, pointFLJFF, new C456230Hun(this.LL, view3, str, i));
                            }
                            return true;
                        }
                        AbstractC456130Hud abstractC456130Hud = this.LL.LLILLJJLI;
                        if (abstractC456130Hud != null) {
                            abstractC456130Hud.LIZIZ();
                        }
                        C455290HtH.LIZIZ(view3).start();
                        return true;
                    }
                });
            }
            i++;
        }
    }

    public final void setEmojiViewSize(float f) {
        Iterator<List<C456220Hum>> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            Iterator<C456220Hum> it3 = it2.next().iterator();
            while (it3.hasNext()) {
                it3.next().LJJJJI(f);
            }
        }
    }

    public final void setIncludePadding(boolean z) {
        Iterator<List<C456220Hum>> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            Iterator<C456220Hum> it3 = it2.next().iterator();
            while (it3.hasNext()) {
                it3.next().setIncludeFontPadding(z);
            }
        }
    }

    public final void setNeedPlayAnimation(boolean z) {
        this.LLILZ = z;
    }

    public final void setOnEmojiSelected(AbstractC456130Hud abstractC456130Hud) {
        this.LLILLJJLI = abstractC456130Hud;
    }

    public C456210Hul(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C456210Hul(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList arrayList = new ArrayList();
        this.LL = arrayList;
        this.LLILLL = new MutableLiveData<>();
        this.LLILZ = true;
        ViewGroup.inflate(context, R.layout.coe, this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.gz2);
        tuxTextView.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.gz5);
        tuxTextView2.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.gz8);
        tuxTextView3.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.gza);
        tuxTextView4.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.gzb);
        tuxTextView5.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView6 = (TuxTextView) findViewById(R.id.gzc);
        tuxTextView6.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView7 = (TuxTextView) findViewById(R.id.gzd);
        tuxTextView7.LJJJJI(C418440Gaw.LIZIZ(36));
        TuxTextView tuxTextView8 = (TuxTextView) findViewById(R.id.gze);
        tuxTextView8.LJJJJI(C418440Gaw.LIZIZ(36));
        this.LLILZIL = (C456220Hum) findViewById(R.id.gzj);
        arrayList.add(C1697810uHb.LJIIJJI(tuxTextView, tuxTextView2, tuxTextView3, tuxTextView4));
        arrayList.add(C1697810uHb.LJIIJJI(tuxTextView5, tuxTextView6, tuxTextView7, tuxTextView8));
    }
}
