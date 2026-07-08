package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1103130eoR {
    void LIZ(boolean z);

    void LIZIZ();

    void LIZLLL();

    View LJ();

    boolean LJFF();

    void LJI(boolean z);

    void addView(View view);

    <T extends View> T findViewById(int i);

    View getContentView();

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    int getVisibility();

    void post(Runnable runnable);

    void setAlpha(float f);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setVisibility(int i);
}
