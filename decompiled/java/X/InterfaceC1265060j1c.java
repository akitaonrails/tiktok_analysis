package X;

import android.content.Context;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowerRelationState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1265060j1c {
    List<InterfaceC1891350zJl> CZ0(FollowerRelationState followerRelationState);

    int El0();

    C1265190j1p FN1(FollowerRelationState followerRelationState);

    boolean GD2();

    void Ig1(int i, String str);

    String KU1();

    void LJJJZ(Function1<? super FollowerRelationState, FollowerRelationState> function1);

    void Oc0(List<? extends InterfaceC1891350zJl> list);

    void Om2(String str);

    int Qs0();

    void Ss0(String str);

    Context getContext();

    String getEnterFrom();

    Map<String, Boolean> kV1();

    void y72(int i);
}
