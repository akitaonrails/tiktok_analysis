package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.NaviAssetUploader;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviCreateRequest;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10JV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10JV {
    public static final C10JV LIZ = new C10JV();

    public static final void LIZ(String str, Function1<? super String, Unit> function1) {
        ProfileNaviCreateRequest.Api api = ProfileNaviCreateRequest.LIZ;
        C10JW.LIZ(str).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516201zk(function1, 338), new C516201zk(function1, 339));
    }

    public static final void LIZLLL(Context context, Bitmap bitmap, Function2<? super List<String>, ? super String, Unit> function2) {
        try {
            C0VSJ c0vsjLIZIZ = C2181408ge.LIZIZ(context, bitmap);
            if (c0vsjLIZIZ != null) {
                NaviAssetUploader naviAssetUploader = NaviAssetUploader.LIZ;
                AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(function2, (Function2<? super List<String>, ? super String, Unit>) 394);
                naviAssetUploader.getClass();
                NaviAssetUploader.LIZ(c0vsjLIZIZ, awS607S0100000_28);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            function2.invoke(C13BV.INSTANCE, "");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0HgY] */
    public static final C447400HgY LIZIZ(final Context context, List list, int i, boolean z, Function1 function1) {
        ?? r0 = new FrameLayout(context) { // from class: X.0HgY
            public final TuxTextView LL;
            public final C01GW LLILLJJLI;

            private final C447390HgX getSkinToneAdapter() {
                return (C447390HgX) this.LLILLJJLI.getValue();
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                getSkinToneAdapter().LLILZ = -1;
                getSkinToneAdapter().notifyDataSetChanged();
            }

            {
                RecyclerView recyclerView;
                super(context, null, 0);
                this.LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(616));
                FrameLayout.inflate(context, R.layout.egu, this);
                View viewFindViewById = findViewById(R.id.s4n);
                if ((viewFindViewById instanceof RecyclerView) && (recyclerView = (RecyclerView) viewFindViewById) != null) {
                    recyclerView.setLayoutManager(new GridLayoutManager(context, 6));
                    recyclerView.setAdapter(getSkinToneAdapter());
                    recyclerView.setHasFixedSize(true);
                }
                this.LL = (TuxTextView) findViewById(R.id.s4q);
            }

            public final void LIZ(boolean z2) {
                getSkinToneAdapter().LLILZLL = z2;
            }

            public final void setCategoryName(int i2) {
                TuxTextView tuxTextView = this.LL;
                if (tuxTextView != null) {
                    tuxTextView.setText(i2);
                }
            }

            public final void LIZIZ(List<? extends Effect> list2, Function1<? super Effect, Unit> function12) {
                C447390HgX skinToneAdapter = getSkinToneAdapter();
                ((ArrayList) skinToneAdapter.LLILLL).clear();
                ((ArrayList) skinToneAdapter.LLILLL).addAll(list2);
                skinToneAdapter.notifyDataSetChanged();
                skinToneAdapter.LLILZIL = function12;
            }
        };
        r0.setCategoryName(i);
        r0.LIZ(z);
        r0.LIZIZ(list, function1);
        return r0;
    }

    public static final void LIZJ(int i, int i2, String str, Function1 function1, Function1 function12) {
        if (i == 8193) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        function12.invoke(2131835079);
                        return;
                    } else {
                        function12.invoke(2131827136);
                        return;
                    }
                }
                function12.invoke(2131827137);
                return;
            }
            function1.invoke(str);
        }
    }
}
