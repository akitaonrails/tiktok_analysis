package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0T0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC739950T0v implements InterfaceC1581960rGk {
    public Activity activity;
    public Fragment fragment;

    public void onActivityCreated(Bundle bundle) {
    }

    @Override // X.InterfaceC1581960rGk
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC1581960rGk
    public void onCreate(Bundle bundle) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // X.InterfaceC1581960rGk
    public void onDestroy() {
    }

    @Override // X.InterfaceC1581960rGk
    public void onDestroyView() {
    }

    @Override // X.InterfaceC1581960rGk
    public void onDetach() {
        this.activity = null;
    }

    @Override // X.InterfaceC1581960rGk
    public void onPause() {
    }

    @Override // X.InterfaceC1581960rGk
    public void onResume() {
    }

    @Override // X.InterfaceC1581960rGk
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1581960rGk
    public void onStart() {
    }

    @Override // X.InterfaceC1581960rGk
    public void onStop() {
    }

    @Override // X.InterfaceC1581960rGk
    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC1581960rGk
    public void onViewStateRestored(Bundle bundle) {
    }

    public Activity getActivity() {
        return this.activity;
    }

    public Context getContext() {
        return this.activity;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    @Override // X.InterfaceC1581960rGk
    public void onAttach(Activity activity, Fragment fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }
}
