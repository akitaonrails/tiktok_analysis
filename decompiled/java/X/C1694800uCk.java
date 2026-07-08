package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.emoji2.text.e;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694800uCk implements InterfaceC1695000uD4 {
    public final View LIZ;
    public final InterfaceC1694900uCu LIZIZ;
    public C1691930u87 LJ;
    public C1692140u8S LJFF;
    public InterfaceC1374305Zl LJI;
    public Rect LJIIJJI;
    public final C1694810uCl LJIIL;
    public Function1<? super List<? extends InterfaceC1694390uC5>, Unit> LIZJ = AFwS266S0000000_25.get$arr$(602);
    public Function1<? super C1695040uD8, Unit> LIZLLL = AFwS266S0000000_25.get$arr$(603);
    public C1686970u07 LJII = new C1686970u07("", C1692280u8g.LIZIZ, 4);
    public C1695020uD6 LJIIIIZZ = C1695020uD6.LJI;
    public final List<WeakReference<InputConnectionC1694650uCV>> LJIIIZ = new ArrayList();
    public final C01GW LJIIJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 1171));

    /* JADX WARN: Type inference failed for: r4v1, types: [X.0uCo] */
    @Override // X.InterfaceC1695000uD4
    public final InputConnectionC1694650uCV LIZ(EditorInfo editorInfo) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        C1686970u07 c1686970u07 = this.LJII;
        String str = c1686970u07.LIZ.LLILLJJLI;
        long j = c1686970u07.LIZIZ;
        C1695020uD6 c1695020uD6 = this.LJIIIIZZ;
        int i4 = c1695020uD6.LJ;
        if (i4 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!c1695020uD6.LIZ) {
                i = 0;
            } else {
                i = 6;
            }
        } else if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else {
            if (i4 != 7) {
                "invalid ImeAction".toString();
                throw new IllegalStateException("invalid ImeAction");
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        if (Build.VERSION.SDK_INT >= 24) {
            C1694560uCM c1694560uCM = c1695020uD6.LJFF;
            if (Intrinsics.LJFF(c1694560uCM, C1694560uCM.LLILLL)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1694560uCM, 10));
                Iterator<C1694530uCJ> it2 = c1694560uCM.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
        }
        int i5 = c1695020uD6.LIZLLL;
        if (i5 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (i5 == 2) {
                editorInfo.imeOptions |= Integer.MIN_VALUE;
                i2 = 1;
            } else if (i5 == 3) {
                i2 = 2;
            } else if (i5 == 4) {
                i2 = 3;
            } else if (i5 == 5) {
                i2 = 17;
            } else if (i5 == 6) {
                i2 = 33;
            } else if (i5 == 7) {
                i2 = 129;
            } else if (i5 == 8) {
                i2 = 18;
            } else if (i5 == 9) {
                i2 = 8194;
            } else {
                "Invalid Keyboard Type".toString();
                throw new IllegalStateException("Invalid Keyboard Type");
            }
        } else {
            i2 = 1;
        }
        editorInfo.inputType = i2;
        if (!c1695020uD6.LIZ && (i2 & 1) == 1) {
            editorInfo.inputType = i2 | 131072;
            if (c1695020uD6.LJ == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 1) == 1) {
            int i7 = c1695020uD6.LIZIZ;
            if (i7 == 1) {
                editorInfo.inputType = i6 | SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (c1695020uD6.LIZJ) {
                editorInfo.inputType |= 32768;
            }
        }
        int i8 = C1692280u8g.LIZJ;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = C1692280u8g.LIZLLL(j);
        C1695010uD5.LIZIZ(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (C1694930uCx.LIZ && (i3 = c1695020uD6.LIZLLL) != 7 && i3 != 8) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(C1697810uHb.LJIIJJI(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
            editorInfo.setSupportedHandwritingGesturePreviews(C13LQ.LJLIIL(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        }
        if (e.LJ()) {
            e.LIZ().LJIIJJI(editorInfo);
        }
        InputConnectionC1694650uCV inputConnectionC1694650uCV = new InputConnectionC1694650uCV(this.LJII, new InterfaceC1694680uCY() { // from class: X.0uCo
            @Override // X.InterfaceC1694680uCY
            public final void J3(KeyEvent keyEvent) {
                ((BaseInputConnection) this.LIZ.LJIIJ.getValue()).sendKeyEvent(keyEvent);
            }

            @Override // X.InterfaceC1694680uCY
            public final void LIZIZ(List<? extends InterfaceC1694390uC5> list) {
                this.LIZ.LIZJ.invoke(list);
            }

            @Override // X.InterfaceC1694680uCY
            public final void LIZJ(int i9) {
                this.LIZ.LIZLLL.invoke(new C1695040uD8(i9));
            }

            @Override // X.InterfaceC1694680uCY
            public final void LIZLLL(InputConnectionC1694650uCV inputConnectionC1694650uCV2) {
                int size = ((ArrayList) this.LIZ.LJIIIZ).size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (Intrinsics.LJFF(((Reference) ListProtector.get(this.LIZ.LJIIIZ, i9)).get(), inputConnectionC1694650uCV2)) {
                        ListProtector.remove(this.LIZ.LJIIIZ, i9);
                        return;
                    }
                }
            }

            @Override // X.InterfaceC1694680uCY
            public final void LIZ(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
                C1694810uCl c1694810uCl = this.LIZ.LJIIL;
                synchronized (c1694810uCl.LIZJ) {
                    try {
                        c1694810uCl.LJFF = z5;
                        c1694810uCl.LJI = z6;
                        c1694810uCl.LJII = z7;
                        c1694810uCl.LJIIIIZZ = z8;
                        if (z3) {
                            c1694810uCl.LJ = true;
                            if (c1694810uCl.LJIIIZ != null) {
                                c1694810uCl.LIZ();
                            }
                        }
                        c1694810uCl.LIZLLL = z4;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }, this.LJIIIIZZ.LIZJ, this.LJ, this.LJFF, this.LJI);
        ((ArrayList) this.LJIIIZ).add(new WeakReference(inputConnectionC1694650uCV));
        return inputConnectionC1694650uCV;
    }

    public C1694800uCk(View view, C1694870uCr c1694870uCr, InterfaceC1694900uCu interfaceC1694900uCu) {
        this.LIZ = view;
        this.LIZIZ = interfaceC1694900uCu;
        this.LJIIL = new C1694810uCl(c1694870uCr, interfaceC1694900uCu);
    }
}
