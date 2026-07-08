package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EW2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EW2 extends AbstractC1664490tPr<C0EW9, C0EW3> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(26));
    public RecyclerView LLJJJJ;
    public C0EDF LLJJJJJIL;
    public C576370Mj5 LLJJJJLIIL;
    public C20627315nb LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;

    public final void LLLLLJIL(ResourceItem resourceItem) {
        int length;
        String str = resourceItem.extra;
        if (str != null && (!a0.LJJJIL(str))) {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("grid_desc"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("layout");
            if (jSONArrayOptJSONArray != null) {
                length = jSONArrayOptJSONArray.length();
            } else {
                length = 0;
            }
            int[][] iArr = new int[length][];
            for (int i = 0; i < length; i++) {
                int[] iArr2 = new int[4];
                int i2 = 0;
                do {
                    iArr2[i2] = 0;
                    i2++;
                } while (i2 < 4);
                iArr[i] = iArr2;
            }
            if (jSONArrayOptJSONArray != null && length > 0) {
                int i3 = 0;
                do {
                    JSONArray jSONArray = JSONArrayProtectorUtils.getJSONArray(jSONArrayOptJSONArray, i3);
                    int[] iArr3 = new int[4];
                    if (jSONArray != null && jSONArray.length() > 0) {
                        int length2 = jSONArray.length();
                        for (int i4 = 0; i4 < length2; i4++) {
                            iArr3[i4] = jSONArray.optInt(i4);
                        }
                    }
                    iArr[i3] = iArr3;
                    i3++;
                } while (i3 < length);
            }
            C537760L7e c537760L7e = new C537760L7e("", jSONObject.optInt("R"), jSONObject.optInt("C"), length, iArr);
            Function1<String, Unit> function1 = LLLLIL().LIZLLL;
            String str2 = resourceItem.extra;
            if (str2 == null) {
                str2 = "";
            }
            function1.invoke(str2);
            C538370L9n c538370L9nLIZ = C538390L9p.LIZ(c537760L7e);
            C576370Mj5 c576370Mj5 = this.LLJJJJLIIL;
            if (c576370Mj5 != null) {
                c576370Mj5.LIZLLL(c538370L9nLIZ);
            }
            C576370Mj5 c576370Mj52 = this.LLJJJJLIIL;
            if (c576370Mj52 != null) {
                C1591860rWi.LIZ(c576370Mj52, new AwS584S0100000_5(this, 22));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C576370Mj5 c576370Mj5 = (C576370Mj5) findViewById(R.id.j5v);
        this.LLJJJJLIIL = c576370Mj5;
        if (c576370Mj5 != null) {
            c576370Mj5.setDividerWidth(0.0f);
        }
        this.LLJJL = (C20627315nb) findViewById(R.id.j5z);
        int iLIZIZ = C1415610mwR.LIZIZ() - C390810FTz.LIZ(48.0f);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.j5y);
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIILL(R.id.j5w, iLIZIZ);
        c19mb.LJIIJJI(R.id.j5w, (iLIZIZ * 16) / 9);
        c19mb.LJIIIZ(R.id.j5w, 6, R.id.j5y, 6, C390810FTz.LIZ(24.0f));
        c19mb.LJIIIZ(R.id.j5w, 7, R.id.j5y, 7, C390810FTz.LIZ(24.0f));
        c19mb.LJIIIZ(R.id.j5w, 3, R.id.y9j, 4, C390810FTz.LIZ(12.0f));
        c19mb.LIZIZ(constraintLayout);
        C20627315nb c20627315nb = this.LLJJL;
        if (c20627315nb != null) {
            c20627315nb.setAnimationDuration(800L);
        }
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) findViewById(R.id.smt);
        this.LLJL = (C197039127h) findViewById(R.id.smu);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.j5u);
        this.LLJJJJ = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C346260Dho(recyclerView, 1));
            recyclerView.setAdapter(new AbstractC21673619ry<C0EW6>() { // from class: X.0EWA
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return 6;
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    int iIntValue;
                    Integer numLIZJ;
                    Integer numLIZJ2;
                    C20627315nb c20627315nb2 = new C20627315nb(recyclerView.getContext(), null, 6);
                    C0EW2 c0ew2 = this;
                    C786410Ut5.T6(c20627315nb2, new ViewGroup.LayoutParams(C1618190sDB.LIZ(56), C1618190sDB.LIZ(56)));
                    c20627315nb2.setSkeletonWidth(-1);
                    c20627315nb2.setSkeletonHeight(-1);
                    c20627315nb2.setLoading(true);
                    c20627315nb2.setAnimationDuration(800L);
                    Context sceneContext = c0ew2.getSceneContext();
                    int iIntValue2 = 0;
                    if (sceneContext != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, sceneContext)) != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c20627315nb2.setPulsingColor(iIntValue);
                    Context sceneContext2 = c0ew2.getSceneContext();
                    if (sceneContext2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.dz, sceneContext2)) != null) {
                        iIntValue2 = numLIZJ.intValue();
                    }
                    c20627315nb2.setPlaceholderColor(iIntValue2);
                    RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c20627315nb2) { // from class: X.0EW6
                    };
                    try {
                        View view2 = viewHolder.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
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
                                stringBuffer.append(C0EW6.class.getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
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
                    C20612085q.LIZ = C0EW6.class.getName();
                    return viewHolder;
                }

                @Override // X.AbstractC21673619ry
                public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(getSceneContext(), 0, false));
        }
        TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 0));
        }
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS140S0100000_5(this, 1));
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EW8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EW9) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 23));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EW5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EW9) obj).LIZ;
            }
        }, new AwS584S0100000_5(this, 17));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EW7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EW9) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 18));
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EW4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eka, viewGroup, false);
    }
}
