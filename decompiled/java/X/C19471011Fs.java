package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471011Fs extends FrameLayout {
    public final C21599719g3 LL;
    public final LinearLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final List<ImageView> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0QlF, androidx.viewpager.widget.PagerAdapter] */
    public C19471011Fs(final EcTakePhotoActivity ecTakePhotoActivity, final AwS273S0300000_29 awS273S0300000_29) {
        int i;
        super(ecTakePhotoActivity, null, 0);
        this.LLILZ = new ArrayList();
        FrameLayout.inflate(ecTakePhotoActivity, R.layout.bqw, this);
        C21599719g3 c21599719g3 = (C21599719g3) findViewById(R.id.jlo);
        this.LL = c21599719g3;
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.jln);
        this.LLILLL = (TuxTextView) findViewById(R.id.jll);
        final ?? r3 = new PagerAdapter() { // from class: X.0QlF
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return 2;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final Object LJJI(int i2, ViewGroup viewGroup) {
                int i3;
                int i4;
                String str;
                if (i2 == 0) {
                    i3 = 2131832996;
                    i4 = 2131833009;
                    str = "image/ec_helper_guide_camera.png";
                } else {
                    i3 = 2131832993;
                    i4 = 2131833012;
                    str = "image/ec_helper_guide_album.png";
                }
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext(), str, i3, i4) { // from class: X.0QlE
                    {
                        super(context, null, 0);
                        FrameLayout.inflate(context, R.layout.bp7, this);
                        ImageView imageView = (ImageView) findViewById(R.id.jlm);
                        TextView textView = (TextView) findViewById(R.id.jlq);
                        TextView textView2 = (TextView) findViewById(R.id.jlp);
                        textView.setText(context.getText(i3));
                        textView2.setText(context.getText(i4));
                        C1517140paC.LIZIZ(C1517140paC.LIZ, imageView, str);
                    }
                };
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final boolean LJJIFFI(View view, Object obj) {
                return Intrinsics.LJFF(view, obj);
            }
        };
        c21599719g3.setAdapter(r3);
        for (int i2 = 0; i2 < 2; i2++) {
            List<ImageView> list = this.LLILZ;
            ImageView imageView = new ImageView(ecTakePhotoActivity);
            if (i2 == 0) {
                i = R.drawable.ble;
            } else {
                i = R.drawable.blf;
            }
            imageView.setImageDrawable(ecTakePhotoActivity.getDrawable(i));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C0H9H.LIZIZ(8), C0H9H.LIZIZ(8));
            layoutParams.setMargins(C0H9H.LIZIZ(2), 0, C0H9H.LIZIZ(2), 0);
            this.LLILLJJLI.addView(imageView, layoutParams);
            ListProtector.add(list, i2, imageView);
        }
        this.LL.LIZLLL(new InterfaceC469360Ias() { // from class: X.11Fr
            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i3) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i3, float f, int i4) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i3) {
                getClass();
                int i4 = 0;
                do {
                    ((ImageView) ListProtector.get(this.LLILZ, i4)).setImageDrawable(ecTakePhotoActivity.getDrawable(R.drawable.blf));
                    i4++;
                } while (i4 < 2);
                ((ImageView) ListProtector.get(this.LLILZ, i3)).setImageDrawable(ecTakePhotoActivity.getDrawable(R.drawable.ble));
                getClass();
                if (i3 == 1) {
                    this.LLILLL.setText(ecTakePhotoActivity.getText(2131821932));
                } else {
                    this.LLILLL.setText(ecTakePhotoActivity.getText(2131833049));
                }
            }
        });
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.11Ft
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                if (view != null) {
                    int currentItem = this.LLILZ.LL.getCurrentItem();
                    getClass();
                    if (currentItem == 1) {
                        awS273S0300000_29.invoke();
                    } else {
                        C21599719g3 c21599719g32 = this.LLILZ.LL;
                        c21599719g32.LLFFF(c21599719g32.getCurrentItem() + 1, true);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this.LLILLL);
    }
}
