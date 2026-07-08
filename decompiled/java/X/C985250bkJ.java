package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985250bkJ extends ConstraintLayout {
    public final List<C985260bkK> LL;

    public final void setCountdownVisibility(boolean z) {
        for (C985260bkK c985260bkK : this.LL) {
            if (c985260bkK != null) {
                c985260bkK.setCountdownVisibility(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C985250bkJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C13BV.INSTANCE;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gy_, this, true);
        this.LL = C1697810uHb.LJIIJJI(findViewById(R.id.ye5), findViewById(R.id.cht));
    }

    public final void e0(boolean z, List list, Map map) {
        String str;
        EnumC985270bkL enumC985270bkL;
        if (list != null && list.size() == 2) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                ImageModel imageModel = null;
                if (i >= 0) {
                    C954460awe c954460awe = (C954460awe) obj;
                    C985260bkK c985260bkK = (C985260bkK) ListProtector.get(this.LL, i);
                    if (c985260bkK == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("No UserInfoView defined for host ");
                        sbLIZ.append(i);
                        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        C754570Tip c754570Tip = c954460awe.LJIJJ;
                        if (c754570Tip != null) {
                            str = c754570Tip.LIZIZ;
                            imageModel = c754570Tip.LIZJ;
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str) && imageModel != null) {
                            c985260bkK.LLILZ.setText(str);
                            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                            int i3 = imageModel.width;
                            int i4 = imageModel.height;
                            c1324610kZfLJIIIZ.LJ = i3;
                            c1324610kZfLJIIIZ.LJFF = i4;
                            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                            c1324610kZfLJIIIZ.LJJI(c985260bkK.LL);
                        }
                        if (z) {
                            enumC985270bkL = EnumC985270bkL.LOADING;
                        } else if (map != null && Intrinsics.LJFF(map.get(Long.valueOf(c954460awe.LJ)), Boolean.TRUE)) {
                            enumC985270bkL = EnumC985270bkL.READY;
                        } else {
                            enumC985270bkL = EnumC985270bkL.NOT_READY;
                        }
                        c985260bkK.setReadyStatus(enumC985270bkL);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        C20441214yg.LJ("CatchBeansUserInfoViewGroup", "Hosts list size is not 2");
    }
}
