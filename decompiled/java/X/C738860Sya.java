package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.detail.component.biz.friends.FriendsDetailBottomBarQuickDMAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738860Sya implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(C738860Sya c738860Sya, Editable editable) {
    }

    public static final void afterTextChanged$1(C738860Sya c738860Sya, Editable editable) {
    }

    public static final void beforeTextChanged$0(C738860Sya c738860Sya, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C738860Sya c738860Sya, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C738860Sya(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onTextChanged$0(C738860Sya c738860Sya, CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        boolean z;
        String strValueOf = String.valueOf(charSequence);
        int length = strValueOf.length() - 1;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            if (!z2) {
                i4 = i5;
            } else {
                i4 = length;
            }
            if (Intrinsics.LJI(strValueOf.charAt(i4), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i5++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        if (TextUtils.isEmpty(strValueOf.subSequence(i5, length + 1).toString())) {
            ((FriendsDetailBottomBarQuickDMAssem) c738860Sya.l0).tp(true);
        } else {
            ((FriendsDetailBottomBarQuickDMAssem) c738860Sya.l0).tp(false);
        }
    }

    public static final void onTextChanged$1(C738860Sya c738860Sya, CharSequence charSequence, int i, int i2, int i3) {
        ((StoryQuickDMBottomBarAssem) c738860Sya.l0).Ip(String.valueOf(charSequence));
    }
}
