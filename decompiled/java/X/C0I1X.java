package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0I1X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1X {
    public static final C459730I1b LJIIJJI = new Object() { // from class: X.0I1b
    };
    public final C0I1Y LIZ;
    public final ViewGroup LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public final int LJII;
    public final C452120HoA LJIIIIZZ;
    public final List<C451030HmP> LJIIIZ;
    public final C449990Hkj LJIIJ;

    public final List<C0I1Z> LIZ() {
        List<C451030HmP> list = this.LJIIIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C451030HmP c451030HmP : (ArrayList) list) {
            arrayList.add(new C0I1Z());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0HoA] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0I1W] */
    public C0I1X(final EditText editText, C0I1Y c0i1y, ViewGroup viewGroup, List list, int i, int i2) {
        int iLJIIJ;
        int i3 = i;
        List listLIZ = (i2 & 8) != 0 ? C456310Huv.LIZ() : list;
        C459730I1b c459730I1b = (i2 & 16) != 0 ? LJIIJJI : null;
        i3 = (i2 & 32) != 0 ? -1 : i3;
        this.LIZ = c0i1y;
        this.LIZIZ = viewGroup;
        this.LIZJ = listLIZ;
        this.LIZLLL = i3;
        Context context = editText.getContext();
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() > 0) {
            iLJIIJ = numValueOf.intValue();
        } else {
            iLJIIJ = C12ES.LJIIJ(editText.getContext());
        }
        this.LJ = iLJIIJ;
        c459730I1b.getClass();
        float fLIZJ = C12ES.LIZJ(40.0f, context);
        this.LJFF = fLIZJ;
        float fLIZJ2 = C12ES.LIZJ(4.0f, context);
        float fLIZJ3 = C12ES.LIZJ(40.0f, context);
        this.LJI = fLIZJ3;
        int iMin = Math.min(listLIZ.size(), (int) (((iLJIIJ - (fLIZJ3 * 2)) + fLIZJ2) / (fLIZJ + fLIZJ2)));
        this.LJII = iMin;
        final ?? r1 = new InterfaceC452130HoB() { // from class: X.0I1W
            @Override // X.InterfaceC452130HoB
            public final void LIZ(String str) {
                int iIndexOf = this.LIZ.LIZJ.indexOf(str);
                C424420Gka.LIZ().LIZJ(str);
                this.LIZ.LIZ.LIZ(iIndexOf, str, C2097608Jq.LJ());
            }
        };
        this.LJIIIIZZ = new InterfaceC449820HkS(editText, r1) { // from class: X.0HoA
            public final EditText LIZ;
            public final InterfaceC452130HoB LIZIZ;

            @Override // X.InterfaceC449820HkS
            public final /* synthetic */ void E0() {
            }

            @Override // X.InterfaceC449820HkS
            public final void Id() {
            }

            @Override // X.InterfaceC449820HkS
            public final void Kd(CommentPersonalizedEmoji commentPersonalizedEmoji, int i4, int i5) {
            }

            @Override // X.InterfaceC449820HkS
            public final void LIZ(View view, C451030HmP c451030HmP) {
            }

            @Override // X.InterfaceC449820HkS
            public final /* synthetic */ void LJIILIIL(Aweme aweme) {
            }

            {
                this.LIZ = editText;
                this.LIZIZ = r1;
            }

            @Override // X.InterfaceC449820HkS
            public final void Jd(int i4, int i5, String str) {
                if (str == null) {
                    return;
                }
                if (i4 == 2) {
                    this.LIZIZ.LIZ(str);
                }
                int selectionStart = this.LIZ.getSelectionStart();
                int selectionEnd = this.LIZ.getSelectionEnd();
                if (selectionStart <= 0) {
                    selectionStart = 0;
                }
                if (selectionEnd <= 0) {
                    selectionEnd = 0;
                }
                if (selectionStart == selectionEnd) {
                    C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQpuHcz9o3N2yIDoMDNXN/G3uRPAFeT4J0p", null)).insert(selectionStart, str);
                } else {
                    try {
                        C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQpuHcz9o3N2yIDoMDNXN/G3uRPAFeT4J0p", null)).replace(selectionStart, selectionEnd, str);
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                int length = selectionStart + str.length();
                if (length >= this.LIZ.length()) {
                    EditText editText2 = this.LIZ;
                    editText2.setSelection(editText2.length());
                } else {
                    this.LIZ.setSelection(length);
                }
            }
        };
        List<String> listSubList = listLIZ.subList(0, iMin < 0 ? 0 : iMin);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        for (String str : listSubList) {
            C451030HmP c451030HmP = new C451030HmP();
            c451030HmP.LIZIZ = str;
            arrayList.add(c451030HmP);
        }
        this.LJIIIZ = arrayList;
        C452120HoA c452120HoA = this.LJIIIIZZ;
        ViewGroup viewGroup2 = this.LIZIZ;
        final int i4 = this.LJII;
        final AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(this, 364);
        this.LJIIJ = new C449990Hkj(c452120HoA, viewGroup2, null, null, null, arrayList, new C0DXR(i4, awS585S0100000_6) { // from class: X.0DXs
            public final int LL;
            public final Function1<Integer, Integer> LLILLJJLI;

            {
                this.LL = i4;
                this.LLILLJJLI = awS585S0100000_6;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() % this.LL;
                int iIntValue = this.LLILLJJLI.invoke(Integer.valueOf(C1389340mG4.LIZJ(null, null).LIZIZ)).intValue();
                int i5 = this.LL;
                rect.left = (viewLayoutPosition * iIntValue) / i5;
                rect.right = iIntValue - (((viewLayoutPosition + 1) * iIntValue) / i5);
            }
        }, this.LJII, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), 0, null, Boolean.FALSE);
    }
}
