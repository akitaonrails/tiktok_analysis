package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367680lh8 extends ViewOnTouchListenerC1367610lh1 {
    public List<Integer> LLJJJJ;
    public List<String> LLJJJJJIL;
    public View LLJJJJLIIL;
    public C387140FFw LLJJL;
    public TextView LLJJLIIIJLLLLLLLZ;
    public LinearLayoutManager LLJL;
    public C386860FEu LLJLIL;
    public final float LLJLILLLLZIIL;

    @Override // X.ViewOnTouchListenerC1367610lh1
    public final void LIZJ() {
        this.LLJIJIL = (C1367990lhd) this.LLILLJJLI.findViewById(R.id.y08);
        this.LLJ = (C1749280vcc) this.LLILLJJLI.findViewById(R.id.w28);
        this.LLJI = (RecyclerView) this.LLILLJJLI.findViewById(R.id.t0e);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.LL);
        this.LLJL = linearLayoutManager;
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLJI;
        if (recyclerView2 != null) {
            final Activity activity = this.LL;
            recyclerView2.addOnScrollListener(new C1379050lzT(activity) { // from class: X.0lh9
                @Override // X.C1379050lzT, X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView3, int i) {
                    int iFindFirstVisibleItemPosition;
                    super.LJJIIJ(recyclerView3, i);
                    EditText editText = this.LLILLJJLI.LLIZ;
                    C387140FFw c387140FFw = null;
                    if (editText != null && editText.hasFocus()) {
                        editText.clearFocus();
                    }
                    LinearLayoutManager linearLayoutManager2 = this.LLILLJJLI.LLJL;
                    if (linearLayoutManager2 != null) {
                        iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
                    } else {
                        iFindFirstVisibleItemPosition = -1;
                    }
                    int sectionForPosition = ((C1367730lhD) this.LLILLJJLI.LLJILJILJ).getSectionForPosition(iFindFirstVisibleItemPosition);
                    List<String> list = this.LLILLJJLI.LLJJJJJIL;
                    if (list != null && !list.isEmpty() && sectionForPosition >= 0 && sectionForPosition < list.size()) {
                        C387140FFw c387140FFw2 = this.LLILLJJLI.LLJJL;
                        if (c387140FFw2 != null) {
                            c387140FFw = c387140FFw2;
                        }
                        c387140FFw.setCurrentIndex((String) ListProtector.get(list, sectionForPosition));
                    }
                }

                @Override // X.C1379050lzT, X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView3, int i, int i2) {
                    super.LJJIIZI(recyclerView3, i, i2);
                    if (i2 > C12ES.LIZJ(10.0f, this.LLILLJJLI.LL)) {
                        C1367680lh8 c1367680lh8 = this.LLILLJJLI;
                        C0DLI.LIZ(c1367680lh8.LL, c1367680lh8.LLIZ);
                    }
                }
            });
        }
        RecyclerView recyclerView3 = this.LLJI;
        if (recyclerView3 != null) {
            recyclerView3.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0lhB
                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView4, MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView4, MotionEvent motionEvent) {
                    if (motionEvent.getY() < this.LL.LLJLILLLLZIIL) {
                        return true;
                    }
                    return false;
                }
            });
        }
        View viewFindViewById = this.LLILLJJLI.findViewById(R.id.ubq);
        this.LLJJJJLIIL = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        EditText editText = (EditText) viewFindViewById.findViewById(R.id.u_1);
        this.LLIZ = editText;
        if (editText != null) {
            editText.setTag("relation_search_tag");
        }
        EditText editText2 = this.LLIZ;
        if (editText2 != null) {
            editText2.setHint(2131835514);
        }
        View view = this.LLJJJJLIIL;
        if (view == null) {
            view = null;
        }
        this.LLIZLLLIL = (ImageView) view.findViewById(R.id.coo);
        this.LLJJL = (C387140FFw) this.LLILLJJLI.findViewById(R.id.kl0);
        this.LLJJLIIIJLLLLLLLZ = (TextView) this.LLILLJJLI.findViewById(R.id.kkv);
        C387140FFw c387140FFw = this.LLJJL;
        if (c387140FFw == null) {
            c387140FFw = null;
        }
        c387140FFw.setOnLetterTouchListener(new InterfaceC387150FFx() { // from class: X.0lhA
            @Override // X.InterfaceC387150FFx
            public final void LIZ(int i) {
                int positionForSection = ((C1367730lhD) this.LIZ.LLJILJILJ).getPositionForSection(i);
                C1367680lh8 c1367680lh8 = this.LIZ;
                AbstractC1368060lhk abstractC1368060lhk = c1367680lh8.LLJILJILJ;
                LinearLayoutManager linearLayoutManager2 = c1367680lh8.LLJL;
                if (linearLayoutManager2 != null) {
                    linearLayoutManager2.scrollToPositionWithOffset(positionForSection, 0);
                }
                ((ILogger) ServiceManager.get().getService(ILogger.class)).LIZ();
            }
        });
        C387140FFw c387140FFw2 = this.LLJJL;
        if (c387140FFw2 == null) {
            c387140FFw2 = null;
        }
        TextView textView = this.LLJJLIIIJLLLLLLLZ;
        c387140FFw2.setIndexLetterTv(textView != null ? textView : null);
    }

    @Override // X.ViewOnTouchListenerC1367610lh1
    public final void LIZIZ() {
        super.LIZIZ();
        AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
        if (abstractC1368060lhk != null) {
            abstractC1368060lhk.LLJ = null;
        }
    }

    @Override // X.ViewOnTouchListenerC1367610lh1
    public final void LJIIJJI() {
        C387140FFw c387140FFw;
        super.LJIIJJI();
        if (this.LLILZLL) {
            C387140FFw c387140FFw2 = this.LLJJL;
            c387140FFw = c387140FFw2 != null ? c387140FFw2 : null;
            int visibility = c387140FFw.getVisibility();
            c387140FFw.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c387140FFw);
            return;
        }
        C387140FFw c387140FFw3 = this.LLJJL;
        if (c387140FFw3 == null) {
            c387140FFw3 = null;
        }
        c387140FFw3.setIndexLetters(this.LLJJJJJIL);
        C387140FFw c387140FFw4 = this.LLJJL;
        c387140FFw = c387140FFw4 != null ? c387140FFw4 : null;
        int visibility2 = c387140FFw.getVisibility();
        c387140FFw.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c387140FFw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0DXR, X.0FEu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.ViewOnTouchListenerC1367610lh1
    public final void LJFF(List<? extends IMContact> list) {
        RecyclerView recyclerView;
        this.LLILZLL = false;
        final List<String> list2 = this.LLJJJJJIL;
        final List<Integer> list3 = this.LLJJJJ;
        if (list2 != null && !list2.isEmpty() && list3 != null && !list3.isEmpty()) {
            final int[] iArr = new int[list3.size()];
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Number) ListProtector.get(list3, i)).intValue();
            }
            final String[] strArr = (String[]) list2.toArray(new String[0]);
            SectionIndexer sectionIndexer = new SectionIndexer(iArr, strArr) { // from class: X.0V16
                public final String[] LL;
                public final int[] LLILLJJLI;
                public final int LLILLL;

                @Override // android.widget.SectionIndexer
                public final /* bridge */ /* synthetic */ Object[] getSections() {
                    return this.LL;
                }

                @Override // android.widget.SectionIndexer
                public final int getPositionForSection(int i2) {
                    if (i2 >= 0 && i2 < this.LL.length) {
                        return this.LLILLJJLI[i2];
                    }
                    return -1;
                }

                @Override // android.widget.SectionIndexer
                public final int getSectionForPosition(int i2) {
                    if (i2 >= 0 && i2 < this.LLILLL) {
                        int iBinarySearch = Arrays.binarySearch(this.LLILLJJLI, i2);
                        if (iBinarySearch < 0) {
                            return (-iBinarySearch) - 2;
                        }
                        return iBinarySearch;
                    }
                    return -1;
                }

                {
                    int i2;
                    boolean z;
                    int iMin = Math.min(strArr.length, iArr.length);
                    this.LL = strArr;
                    this.LLILLJJLI = new int[iMin];
                    int i3 = 0;
                    for (int i4 = 0; i4 < iMin; i4++) {
                        if (TextUtils.isEmpty(this.LL[i4])) {
                            this.LL[i4] = " ";
                        } else if (!Intrinsics.LJFF(this.LL[i4], " ")) {
                            String[] strArr2 = this.LL;
                            String str = strArr2[i4];
                            int length = str.length() - 1;
                            int i5 = 0;
                            boolean z2 = false;
                            while (i5 <= length) {
                                if (!z2) {
                                    i2 = i5;
                                } else {
                                    i2 = length;
                                }
                                if (Intrinsics.LJI(str.charAt(i2), 32) <= 0) {
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
                            strArr2[i4] = str.subSequence(i5, length + 1).toString();
                        }
                        this.LLILLJJLI[i4] = i3;
                        i3 += iArr[i4];
                    }
                    this.LLILLL = i3;
                }
            };
            AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
            C1367730lhD c1367730lhD = (C1367730lhD) abstractC1368060lhk;
            c1367730lhD.LLJILJILJ = sectionIndexer;
            c1367730lhD.LLJILLL.LIZ = -1;
            if (abstractC1368060lhk != null) {
                abstractC1368060lhk.LLLIL(list);
            }
            C386860FEu c386860FEu = this.LLJLIL;
            if (c386860FEu != null && (recyclerView = this.LLJI) != null) {
                recyclerView.removeItemDecoration(c386860FEu);
            }
            final Activity activity = this.LL;
            ?? r1 = new C0DXR(activity, list2, list3) { // from class: X.0FEu
                public final Context LL;
                public final float LLILLJJLI;
                public final Paint LLILLL;
                public final C444890HcV LLILZ;
                public final int LLILZIL;
                public final int LLILZLL;
                public final float LLIZ;
                public final Rect LLIZLLLIL;
                public String LLJ;
                public final List<String> LLJI;
                public final List<Integer> LLJIJIL;
                public final int LLJILJIL = -1;

                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                }

                public final String LJ(int i2) {
                    String string;
                    int i3 = 0;
                    int iIntValue = 0;
                    while (true) {
                        if (i3 >= this.LLJIJIL.size()) {
                            break;
                        }
                        iIntValue += ((Integer) ListProtector.get(this.LLJIJIL, i3)).intValue();
                        if (i2 < iIntValue) {
                            if (i3 != -1) {
                                string = (String) ListProtector.get(this.LLJI, i3);
                            }
                        } else {
                            i3++;
                        }
                    }
                    string = null;
                    if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(this.LLJ)) {
                        string = this.LLJ;
                    }
                    if ("recent".equals(string)) {
                        string = this.LL.getString(R.string.kg7);
                    } else if ("Friend".equals(string)) {
                        string = this.LL.getString(R.string.kfh);
                    } else if (i2 == 0) {
                        int i4 = this.LLJILJIL;
                        if (i4 == 0) {
                            string = this.LL.getString(2131835707);
                        } else if (i4 == -1 || i4 == 1) {
                            string = this.LL.getString(2131835746);
                        }
                    }
                    this.LLJ = string;
                    return string;
                }

                {
                    this.LL = activity;
                    activity.getResources();
                    this.LLILLJJLI = C12ES.LIZJ(32.0f, activity);
                    this.LLILLL = new Paint();
                    C444890HcV c444890HcV = new C444890HcV();
                    this.LLILZ = c444890HcV;
                    c444890HcV.setAntiAlias(true);
                    c444890HcV.setColor(C1308910kAL.LIZJ(R.attr.a1k, activity).intValue());
                    c444890HcV.LIZ(62);
                    Paint.FontMetrics fontMetrics = c444890HcV.getFontMetrics();
                    float f = fontMetrics.bottom;
                    this.LLILZIL = (int) (f - fontMetrics.top);
                    this.LLILZLL = ((int) f) - ((int) C12ES.LIZJ(8.0f, activity));
                    this.LLIZ = C12ES.LIZJ(16.0f, activity);
                    this.LLIZLLLIL = new Rect();
                    C12ES.LIZJ(2.0f, activity);
                    int iLIZJ = (int) C12ES.LIZJ(16.0f, activity);
                    new Rect(0, 0, iLIZJ, iLIZJ);
                    this.LLJI = list2;
                    this.LLJIJIL = list3;
                }

                @Override // X.C0DXR
                public final void LIZLLL(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int iFindFirstVisibleItemPosition;
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
                    if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == -1 || iFindFirstVisibleItemPosition < 0 || (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                        return;
                    }
                    View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                    String strLJ = LJ(iFindFirstVisibleItemPosition);
                    if (TextUtils.isEmpty(strLJ)) {
                        return;
                    }
                    TextUtils.equals(this.LL.getString(R.string.kfh), strLJ);
                    boolean z = true;
                    int i2 = iFindFirstVisibleItemPosition + 1;
                    if (LJ(i2) != null && !TextUtils.equals(LJ(i2), strLJ) && view.getHeight() + view.getTop() < this.LLILLJJLI) {
                        canvas.save();
                        canvas.translate(0.0f, (view.getHeight() + view.getTop()) - this.LLILLJJLI);
                    } else {
                        z = false;
                    }
                    this.LLIZLLLIL.set(0, 0, recyclerView2.getRight() - recyclerView2.getPaddingRight(), (int) (recyclerView2.getPaddingTop() + this.LLILLJJLI));
                    this.LLILLL.setColor(C1308910kAL.LIZJ(R.attr.bx, this.LL).intValue());
                    canvas.drawRect(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getRight() - recyclerView2.getPaddingRight(), recyclerView2.getPaddingTop() + this.LLILLJJLI, this.LLILLL);
                    float paddingLeft = view.getPaddingLeft() + this.LLIZ;
                    float paddingTop = recyclerView2.getPaddingTop();
                    float f = this.LLILLJJLI;
                    canvas.drawText(strLJ, paddingLeft, ((paddingTop + f) - ((f - this.LLILZIL) / 2.0f)) - this.LLILZLL, this.LLILZ);
                    if (z) {
                        canvas.restore();
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view, recyclerView2, c21673919s1);
                }
            };
            this.LLJLIL = r1;
            RecyclerView recyclerView2 = this.LLJI;
            if (recyclerView2 != 0) {
                recyclerView2.addItemDecoration(r1);
            }
            LJIIJJI();
        }
    }

    @Override // X.ViewOnTouchListenerC1367610lh1
    public final void LJI(List<Integer> list, List<String> list2) {
        this.LLJJJJ = list;
        this.LLJJJJJIL = list2;
    }

    @Override // X.ViewOnTouchListenerC1367610lh1
    public final void LJII(CharSequence charSequence, List list) {
        RecyclerView recyclerView;
        this.LLILZLL = true;
        C386860FEu c386860FEu = this.LLJLIL;
        if (c386860FEu != null && (recyclerView = this.LLJI) != null) {
            recyclerView.removeItemDecoration(c386860FEu);
        }
        AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
        if (abstractC1368060lhk != null) {
            abstractC1368060lhk.LL = 1;
            abstractC1368060lhk.LLILZIL = charSequence.toString();
            ((ArrayList) abstractC1368060lhk.LLILLL).clear();
            ((ArrayList) abstractC1368060lhk.LLILLL).addAll(list);
            abstractC1368060lhk.notifyDataSetChanged();
        }
        LJIIJJI();
    }

    public C1367680lh8(C19EG c19eg, View view, boolean z, List list, List list2) {
        super(c19eg, view, z);
        this.LLJJJJ = list;
        this.LLJJJJJIL = list2;
        this.LLJLILLLLZIIL = C12ES.LIZJ(32.0f, c19eg);
    }
}
