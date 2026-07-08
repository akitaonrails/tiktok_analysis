package X;

import Y.ACListenerS165S0100000_31;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.15fL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20576115fL {
    public final ViewStub LIZ;
    public Function0<? extends INLEMediaSession> LIZIZ;
    public Function0<? extends NLEModel> LIZJ;
    public C21617919iz LIZLLL;
    public ConstraintLayout LJ;
    public RecyclerView LJFF;
    public ConstraintLayout LJI;
    public final ArrayList<C03DE> LJII = new ArrayList<>();
    public TuxTextView LJIIIIZZ;
    public C197039127h LJIIIZ;
    public C197039127h LJIIJ;

    public C20576115fL(ViewStub viewStub) {
        this.LIZ = viewStub;
    }

    public final void LIZJ(JSONObject jSONObject) throws JSONException {
        AbstractC21673619ry adapter;
        C21617919iz c21617919iz = this.LIZLLL;
        if (c21617919iz != null) {
            c21617919iz.setCanHandleTouchEv(false);
        }
        ConstraintLayout constraintLayout = this.LJI;
        if (constraintLayout != null) {
            C786410Ut5.LL(0, constraintLayout);
        }
        this.LJII.clear();
        LIZ(jSONObject, 0, this.LJII);
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void LIZIZ(Function0<? extends INLEMediaSession> function0, Function0<? extends NLEModel> function02) {
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZ.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.15fK
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, final View view) {
                if (view != null) {
                    final C20576115fL c20576115fL = this.LIZ;
                    TextView textView = (TextView) view.findViewById(R.id.zz7);
                    C786410Ut5.LLIL(textView, 0);
                    textView.setText("NLE");
                    int iApplyDimension = (int) TypedValue.applyDimension(1, 80, view.getResources().getDisplayMetrics());
                    int iApplyDimension2 = (int) TypedValue.applyDimension(1, 48, view.getResources().getDisplayMetrics());
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.width = iApplyDimension;
                    layoutParams.height = iApplyDimension2;
                    C786410Ut5.g6(textView, layoutParams);
                    textView.setBackgroundColor(-16776961);
                    final C817403Hg c817403Hg = new C817403Hg();
                    final C817403Hg c817403Hg2 = new C817403Hg();
                    final C817403Hg c817403Hg3 = new C817403Hg();
                    final C817403Hg c817403Hg4 = new C817403Hg();
                    final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                    final C013C c013c = new C013C();
                    textView.setOnTouchListener(new View.OnTouchListener() { // from class: X.15fM
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            ConstraintLayout constraintLayout;
                            NLEModel nLEModelInvoke;
                            boolean z;
                            float x;
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 1) {
                                    if (action != 2) {
                                        if (action != 3) {
                                            return false;
                                        }
                                    } else {
                                        if (!c013c.element) {
                                            float fAbs = Math.abs(motionEvent.getRawX() - c817403Hg3.element);
                                            float fAbs2 = Math.abs(motionEvent.getRawY() - c817403Hg4.element);
                                            float f = scaledTouchSlop;
                                            if (fAbs > f || fAbs2 > f) {
                                                c013c.element = true;
                                            }
                                        }
                                        if (c013c.element) {
                                            view2.animate().x(motionEvent.getRawX() + c817403Hg.element).y(motionEvent.getRawY() + c817403Hg2.element).setDuration(0L).start();
                                            return true;
                                        }
                                        return true;
                                    }
                                }
                                if (c013c.element) {
                                    int i = view.getResources().getDisplayMetrics().widthPixels;
                                    int i2 = view.getResources().getDisplayMetrics().heightPixels;
                                    int width = view2.getWidth();
                                    int height = view2.getHeight();
                                    float x2 = view2.getX() + (width / 2.0f);
                                    float y = view2.getY() + (height / 2.0f);
                                    float f2 = i - x2;
                                    float f3 = i2 - y;
                                    float[] fArr = {f2, y, f3};
                                    int i3 = 0;
                                    float fMin = x2;
                                    do {
                                        fMin = Math.min(fMin, fArr[i3]);
                                        i3++;
                                    } while (i3 < 3);
                                    if (fMin == x2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    float y2 = 0.0f;
                                    if (z) {
                                        x = 0.0f;
                                    } else if (fMin == f2) {
                                        x = i - width;
                                    } else {
                                        x = view2.getX();
                                    }
                                    if (fMin != y) {
                                        if (fMin == f3) {
                                            y2 = i2 - height;
                                        } else {
                                            y2 = view2.getY();
                                        }
                                    }
                                    view2.animate().x(x).y(y2).setDuration(200L).start();
                                    return true;
                                }
                                C20576115fL c20576115fL2 = c20576115fL;
                                Function0<? extends NLEModel> function03 = c20576115fL2.LIZJ;
                                String string = null;
                                if (function03 != null && (nLEModelInvoke = function03.invoke()) != null) {
                                    string = nLEModelInvoke.toString();
                                }
                                if (c20576115fL2.LIZLLL != null && (constraintLayout = c20576115fL2.LJ) != null && string != null) {
                                    C786410Ut5.LL(0, constraintLayout);
                                    TuxTextView tuxTextView = c20576115fL2.LJIIIIZZ;
                                    if (tuxTextView != null) {
                                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                                    }
                                    C197039127h c197039127h = c20576115fL2.LJIIIZ;
                                    if (c197039127h != null) {
                                        C786410Ut5.LJLLLLLL(0, c197039127h);
                                    }
                                    C197039127h c197039127h2 = c20576115fL2.LJIIJ;
                                    if (c197039127h2 != null) {
                                        C786410Ut5.LJLLLLLL(0, c197039127h2);
                                    }
                                    c20576115fL2.LIZLLL.getTrackApi().reset();
                                    JSONObject jSONObjectOptJSONObject = new JSONObject(string).optJSONObject("Track");
                                    if (jSONObjectOptJSONObject != null) {
                                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                        int i4 = 0;
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            int length = next.length();
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 < length) {
                                                    if (Character.isDigit(next.charAt(i5))) {
                                                        i5++;
                                                    }
                                                } else {
                                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                                                    if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean("MainTrack")) {
                                                        C20576715fR c20576715fR = new C20576715fR(jSONObjectOptJSONObject2);
                                                        c20576715fR.LIZIZ = i4;
                                                        c20576115fL2.LIZLLL.getTrackApi().LIZ(c20576715fR);
                                                        i4++;
                                                    }
                                                }
                                            }
                                        }
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            int length2 = next2.length();
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 < length2) {
                                                    if (Character.isDigit(next2.charAt(i6))) {
                                                        i6++;
                                                    }
                                                } else {
                                                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(next2);
                                                    if (jSONObjectOptJSONObject3 != null && !jSONObjectOptJSONObject3.optBoolean("MainTrack")) {
                                                        C20576715fR c20576715fR2 = new C20576715fR(jSONObjectOptJSONObject3);
                                                        c20576715fR2.LIZIZ = i4;
                                                        c20576115fL2.LIZLLL.getTrackApi().LIZ(c20576715fR2);
                                                        i4++;
                                                    }
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            c817403Hg.element = view2.getX() - motionEvent.getRawX();
                            c817403Hg2.element = view2.getY() - motionEvent.getRawY();
                            c817403Hg3.element = motionEvent.getRawX();
                            c817403Hg4.element = motionEvent.getRawY();
                            c013c.element = false;
                            return true;
                        }
                    });
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.dxl);
                    c20576115fL.LJ = constraintLayout;
                    C786410Ut5.LL(8, constraintLayout);
                    TextView textView2 = (TextView) view.findViewById(R.id.clc);
                    C197039127h c197039127h = null;
                    if (textView2 != null) {
                        textView2.setText("close");
                    } else {
                        textView2 = null;
                    }
                    c20576115fL.getClass();
                    C786410Ut5.I7(new ACListenerS165S0100000_31(c20576115fL, 14), textView2);
                    C21617919iz c21617919iz = (C21617919iz) view.findViewById(R.id.xww);
                    c20576115fL.LIZLLL = c21617919iz;
                    c21617919iz.setClipListener(new InterfaceC21618519j5() { // from class: X.15fN
                        @Override // X.InterfaceC21618519j5
                        public final void LIZIZ(C20576815fS c20576815fS) throws JSONException {
                            c20576115fL.LIZJ(c20576815fS.LIZ);
                        }

                        @Override // X.InterfaceC21618519j5
                        public final void LIZJ(C20576615fQ c20576615fQ) throws JSONException {
                            JSONObject jSONObject = c20576615fQ.LIZ;
                            if (jSONObject != null) {
                                c20576115fL.LIZJ(jSONObject);
                            }
                        }

                        @Override // X.InterfaceC21618519j5
                        public final void LIZLLL(C20576715fR c20576715fR) throws JSONException {
                            c20576115fL.LIZJ(c20576715fR.LIZ);
                        }
                    });
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.dxm);
                    c20576115fL.LJI = constraintLayout2;
                    C786410Ut5.LL(8, constraintLayout2);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tw6);
                    c20576115fL.LJFF = recyclerView;
                    recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
                    C03DC c03dc = new C03DC();
                    c20576115fL.LJFF.setAdapter(c03dc);
                    c03dc.LL = c20576115fL.LJII;
                    c03dc.notifyDataSetChanged();
                    TextView textView3 = (TextView) view.findViewById(R.id.cld);
                    if (textView3 != null) {
                        textView3.setText("close");
                    } else {
                        textView3 = null;
                    }
                    c20576115fL.getClass();
                    C786410Ut5.I7(new ACListenerS165S0100000_31(c20576115fL, 17), textView3);
                    TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zz8);
                    c20576115fL.LJIIIIZZ = tuxTextView;
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 8);
                    }
                    TuxTextView tuxTextView2 = c20576115fL.LJIIIIZZ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText("ve version: 21.8.0.128");
                    }
                    C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.clb);
                    if (c197039127h2 != null) {
                        c197039127h2.setText("DUMP");
                    } else {
                        c197039127h2 = null;
                    }
                    c20576115fL.LJIIIZ = c197039127h2;
                    if (c197039127h2 != null) {
                        C786410Ut5.LJLLLLLL(8, c197039127h2);
                    }
                    C197039127h c197039127h3 = c20576115fL.LJIIIZ;
                    if (c197039127h3 != null) {
                        C786410Ut5.I7(new ACListenerS165S0100000_31(c20576115fL, 15), c197039127h3);
                    }
                    C197039127h c197039127h4 = (C197039127h) view.findViewById(R.id.ckv);
                    if (c197039127h4 != null) {
                        c197039127h4.setText("Effect");
                        c197039127h = c197039127h4;
                    }
                    c20576115fL.LJIIJ = c197039127h;
                    if (c197039127h != null) {
                        C786410Ut5.LJLLLLLL(8, c197039127h);
                    }
                    C197039127h c197039127h5 = c20576115fL.LJIIJ;
                    if (c197039127h5 != null) {
                        C786410Ut5.I7(new ACListenerS165S0100000_31(c20576115fL, 16), c197039127h5);
                    }
                    C197039127h c197039127h6 = c20576115fL.LJIIIZ;
                    if (c197039127h6 != null) {
                        c197039127h6.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.15WU
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                c20576115fL.getClass();
                                return true;
                            }
                        });
                    }
                }
            }
        });
        C786410Ut5.LJLLLL(this.LIZ);
    }

    public static void LIZ(JSONObject jSONObject, int i, ArrayList arrayList) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(next);
                sbLIZ.append(": {");
                arrayList.add(new C03DE(i, C2188811AlT.LIZIZ(sbLIZ)));
                LIZ((JSONObject) objOpt, i + 1, arrayList);
                arrayList.add(new C03DE(i, "}"));
            } else if (objOpt instanceof JSONArray) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(next);
                sbLIZ2.append(": [");
                arrayList.add(new C03DE(i, C2188811AlT.LIZIZ(sbLIZ2)));
                JSONArray jSONArray = (JSONArray) objOpt;
                int i2 = i + 1;
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    Object obj = jSONArray.get(i3);
                    if (obj instanceof JSONObject) {
                        arrayList.add(new C03DE(i2, "{"));
                        LIZ((JSONObject) obj, i2 + 1, arrayList);
                        arrayList.add(new C03DE(i2, "}"));
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(obj);
                        sbLIZ3.append(' ');
                        arrayList.add(new C03DE(i2, C2188811AlT.LIZIZ(sbLIZ3)));
                    }
                }
                arrayList.add(new C03DE(i, e3.f));
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(next);
                sbLIZ4.append(": ");
                sbLIZ4.append(objOpt);
                sbLIZ4.append(' ');
                arrayList.add(new C03DE(i, C2188811AlT.LIZIZ(sbLIZ4)));
            }
        }
    }
}
